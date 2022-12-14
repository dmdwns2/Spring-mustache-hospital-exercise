package com.example.springmustachehospital.book.service;

import com.example.springmustachehospital.book.domain.Author;
import com.example.springmustachehospital.book.domain.Book;
import com.example.springmustachehospital.book.domain.BookResponse;
import com.example.springmustachehospital.book.repository.AuthorRepository;
import com.example.springmustachehospital.book.repository.BookRepository;
import com.example.springmustachehospital.book.repository.PublisherRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class BookService {

    private final BookRepository bookRepository;
    private final AuthorRepository authorRepository;
    private final PublisherRepository publisherRepository;

    public BookService(BookRepository bookRepository, AuthorRepository authorRepository, PublisherRepository publisherRepository) {
        this.bookRepository = bookRepository;
        this.authorRepository = authorRepository;
        this.publisherRepository = publisherRepository;
    }

    public List<BookResponse> findBooks(Pageable pageable){
        Page<Book> bookPage = bookRepository.findAll(pageable);
            List<BookResponse> bookResponses = bookPage.stream()
                    .map(book -> {
                        Optional<Author> optionalAuthor = authorRepository.findById(book.getAuthor_id());
                        return BookResponse.of(book, optionalAuthor.get().getName());
                    }).collect(Collectors.toList());
            return bookResponses;
    }
}
