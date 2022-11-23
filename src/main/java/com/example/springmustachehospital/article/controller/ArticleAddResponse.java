package com.example.springmustachehospital.article.controller;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class ArticleAddResponse {
    private Long id;
    private String title;
    private String content;
}
