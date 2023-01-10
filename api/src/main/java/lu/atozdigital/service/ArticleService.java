package lu.atozdigital.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseStatus;

import lu.atozdigital.model.Article;
import lu.atozdigital.repo.ArticleRepo;

@Service
public class ArticleService {
	@Autowired
	private ArticleRepo articlerepo;

	public Article addArticle(Article article) {
		return articlerepo.save(article);
	}

	public Optional<Article> findArticleById(Long id) {
		return articlerepo.findById(id);
	}

}
