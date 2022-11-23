package com.example.jpa.domain;

import com.example.jpa.repository.AuthorRepository;
import com.example.jpa.repository.BookRepository;
import com.example.jpa.repository.PublisherRepository;
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

    private static BookResponse of(Book book, String authorName){
        return BookResponse.builder()
                .bookId(book.getId())
                .bookName(book.getName())
                .authorName(authorName)
                .build();
    }


}
