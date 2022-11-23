package com.example.springmustachehospital.book.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@Getter
@NoArgsConstructor
public class BookResponse {

    private Long bookId;
    private String bookName;
    private String authorName;

    public static BookResponse of(Book book, String authorName){
        return BookResponse.builder()
                .bookId(book.getId())
                .bookName(book.getName())
                .authorName(authorName)
                .build();
    }


}
