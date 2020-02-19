package com.owlexa.newsArticle.controller;

import com.owlexa.exception.ResourceNotFoundException;
import com.owlexa.newsArticle.model.Article;
import com.owlexa.newsArticle.model.News;
import com.owlexa.newsArticle.repository.ArticleRepository;
import com.owlexa.newsArticle.repository.NewsRepository;
import com.owlexa.provider.model.Provider;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping(value = "/api/news")
public class NewsController {
    @Autowired
    private NewsRepository newsRepository;

    @GetMapping("/")
    public List<News> getAllNews() {
        return newsRepository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<News> getNewsById(@PathVariable(value = "id") Long newsId)
        throws ResourceNotFoundException {
        News news = newsRepository.findById(newsId)
            .orElseThrow(() -> new ResourceNotFoundException("News not found for this id "
                + ":: " + newsId));
        return ResponseEntity.ok().body(news);
    }

    @PostMapping("/")
    public News createNews(@Valid @RequestBody News news) {
        return newsRepository.save(news);
    }

    @PutMapping("/{id}")
    public ResponseEntity<News> updateNews(@PathVariable(value = "id") Long newsId,
        @Valid @RequestBody News newsDetails) throws ResourceNotFoundException {
        News news = newsRepository.findById(newsId)
            .orElseThrow(() -> new ResourceNotFoundException("News not found for this id "
                + ":: " + newsId));

        news.setImg(news.getImg());
        news.setTitle(news.getTitle());
        news.setWording(news.getWording());
        final News updatedNews = newsRepository.save(news);
        return ResponseEntity.ok(updatedNews);
    }

    @DeleteMapping("/{id}")
    public Map<String, Boolean> deleteNews(@PathVariable(value = "id") Long newsId)
        throws ResourceNotFoundException {
        News news = newsRepository.findById(newsId)
            .orElseThrow(() -> new ResourceNotFoundException("News not found for this id "
                + ":: " + newsId));

        newsRepository.delete(news);
        Map<String, Boolean> response = new HashMap<>();
        response.put("deleted", Boolean.TRUE);
        return response;
    }
}
