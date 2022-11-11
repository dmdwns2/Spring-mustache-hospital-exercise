package com.example.springmustachehospital.repository;

import com.example.springmustachehospital.domain.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleRepository extends JpaRepository<Article, Long> {
}
