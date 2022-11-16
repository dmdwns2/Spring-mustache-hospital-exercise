package com.example.springmustachehospital.controller;

import com.example.springmustachehospital.domain.Article;
import com.example.springmustachehospital.domain.ArticleDto;
import com.example.springmustachehospital.repository.ArticleRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ArticleService {

    private final ArticleRepository articleRepository;

    public ArticleService(ArticleRepository articleRepository) {
        this.articleRepository = articleRepository;
    }

    public ArticleDto getArticleById(Long id) {
        Optional<Article> optArticle = articleRepository.findById(id);
        ArticleDto articleDto = Article.of(optArticle.get());
        return articleDto;
    }
}
