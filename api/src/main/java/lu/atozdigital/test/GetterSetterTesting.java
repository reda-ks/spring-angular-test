package lu.atozdigital.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.jupiter.api.Test;

import lu.atozdigital.controller.ArticleResource;
import lu.atozdigital.model.Article;
import lu.atozdigital.service.ArticleService;

class GetterSetterTesting {

	@Test
	void CreateObject() {
		Article article = new Article();
		article.setName("magasin");
		assertEquals("magasin", article.getName());
	}

}
