package com.owlexa.newsArticle.repository;

import com.owlexa.newsArticle.model.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleRepository extends JpaRepository<Article, Long> {

}
