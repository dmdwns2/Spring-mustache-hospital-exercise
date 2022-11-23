package com.example.springmustachehospital.book.repository;

import com.example.springmustachehospital.book.domain.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book,Long> {
}
