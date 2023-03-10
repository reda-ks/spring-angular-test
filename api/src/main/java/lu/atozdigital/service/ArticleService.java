package lu.atozdigital.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

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

	public List<Article> findAllArticle() {
		return articlerepo.findAll();
	}

}
