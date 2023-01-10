package lu.atozdigital.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import lu.atozdigital.model.Article;
import lu.atozdigital.service.ArticleService;

@RestController
@RequestMapping("articles")
public class ArticleResource {
	@Autowired
	private ArticleService articleService;

	@PostMapping
	public ResponseEntity<Article> addArticle(@RequestBody Article article) {
		Article newarticle = articleService.addArticle(article);
		return new ResponseEntity<>(newarticle, HttpStatus.CREATED);
	}

	@GetMapping("/{id}")
	public ResponseEntity<Article> getArticleById(@PathVariable("id") Long id) {
		Optional<Article> article = articleService.findArticleById(id);
		if (!article.isPresent()) {
			return new ResponseEntity<>(article.get(), HttpStatus.BAD_REQUEST);
		}
		return new ResponseEntity<>(article.get(), HttpStatus.OK);
	}
	
	@GetMapping
	public List<Article> getAllArticle() {
		List<Article> article = new ArrayList<Article>();
		article = articleService.findAllArticle();
		return article;
	}
}
