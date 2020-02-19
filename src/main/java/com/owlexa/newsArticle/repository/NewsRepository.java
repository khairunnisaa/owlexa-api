package com.owlexa.newsArticle.repository;

import com.owlexa.newsArticle.model.News;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NewsRepository extends JpaRepository<News, Long> {

}
