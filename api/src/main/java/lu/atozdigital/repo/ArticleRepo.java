package lu.atozdigital.repo;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import lu.atozdigital.model.Article;
@Repository
public interface ArticleRepo extends JpaRepository<Article, Long>{

}
