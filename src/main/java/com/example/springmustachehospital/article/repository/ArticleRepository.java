package com.example.springmustachehospital.article.repository;

import com.example.springmustachehospital.article.domain.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleRepository extends JpaRepository<Article, Long> {
}
