package com.owlexa.newsArticle.controller;

import com.owlexa.exception.ResourceNotFoundException;
import com.owlexa.newsArticle.model.Article;
import com.owlexa.newsArticle.repository.ArticleRepository;
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
@RequestMapping(value = "/api/article")
public class ArticleController {
    @Autowired
    private ArticleRepository articleRepository;

    @GetMapping("/")
    public List<Article> getAllArticle() {
        return articleRepository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Article> getArticleById(@PathVariable(value = "id") Long articleId)
        throws ResourceNotFoundException {
        Article article = articleRepository.findById(articleId)
            .orElseThrow(() -> new ResourceNotFoundException("Article not found for this id "
                + ":: " + articleId));
        return ResponseEntity.ok().body(article);
    }

    @PostMapping("/")
    public Article createArticle(@Valid @RequestBody Article article) {
        return articleRepository.save(article);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Article> updateArticle(@PathVariable(value = "id") Long articleId,
        @Valid @RequestBody Article articleDetails) throws ResourceNotFoundException {
        Article article = articleRepository.findById(articleId)
            .orElseThrow(() -> new ResourceNotFoundException("Article not found for this id "
                + ":: " + articleId));

        article.setImg(articleDetails.getImg());
        article.setTitle(articleDetails.getTitle());
        article.setWording(articleDetails.getWording());
        final Article updatedArticle = articleRepository.save(article);
        return ResponseEntity.ok(updatedArticle);
    }

    @DeleteMapping("/{id}")
    public Map<String, Boolean> deleteArticle(@PathVariable(value = "id") Long articleId)
        throws ResourceNotFoundException {
        Article article = articleRepository.findById(articleId)
            .orElseThrow(() -> new ResourceNotFoundException("Article not found for this id "
                + ":: " + articleId));

        articleRepository.delete(article);
        Map<String, Boolean> response = new HashMap<>();
        response.put("deleted", Boolean.TRUE);
        return response;
    }
}
