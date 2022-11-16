package com.example.springmustachehospital.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Table(name = "article5")
public class Article {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String content;


    //Article 을 ArticleDto로 만드는 부분
    public static ArticleDto of(Article article) {
        return new ArticleDto(article.getId(), article.getTitle(), article.getContent());
    }
}
