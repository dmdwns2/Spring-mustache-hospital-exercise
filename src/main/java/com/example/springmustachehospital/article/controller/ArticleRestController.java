package com.example.springmustachehospital.article.controller;

import com.example.springmustachehospital.article.domain.ArticleDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/articles")
public class ArticleRestController {

    private final ArticleService articleService;

    public ArticleRestController(ArticleService articleService) {
        this.articleService = articleService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<ArticleDto> getArticle(@PathVariable Long id) {
        ArticleDto articleDto = articleService.getArticleById(id);
        return ResponseEntity.ok().body(articleDto);

    }
    @PostMapping
    public ResponseEntity<ArticleAddResponse> addArticle(ArticleAddRequest dto) {
        ArticleAddResponse response = articleService.add(dto);
        return ResponseEntity.ok().body(response);
    }
}