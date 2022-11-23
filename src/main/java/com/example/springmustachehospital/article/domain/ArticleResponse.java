package com.example.springmustachehospital.article.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@Getter
@NoArgsConstructor
public class ArticleResponse {
    private Long id;
    private String title;
    private String content;
}
