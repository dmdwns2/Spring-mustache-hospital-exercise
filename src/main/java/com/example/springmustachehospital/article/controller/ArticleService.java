package com.example.springmustachehospital.article.controller;

import com.example.springmustachehospital.article.domain.Article;
import com.example.springmustachehospital.article.domain.ArticleDto;
import com.example.springmustachehospital.article.repository.ArticleRepository;
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


    public ArticleAddResponse add(ArticleAddRequest dto) {
        Article article = dto.toEntity();
        Article savedArticle = articleRepository.save(article);
        return new ArticleAddResponse(savedArticle.getId(), savedArticle.getTitle(), savedArticle.getContent());
    }
}
