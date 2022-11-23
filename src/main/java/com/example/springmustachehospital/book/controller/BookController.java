package com.example.springmustachehospital.book.controller;

import com.example.springmustachehospital.book.domain.Book;
import com.example.springmustachehospital.book.repository.BookRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/books")
@Slf4j
public class BookController {

    private final BookRepository bookRepository;

    public BookController(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @GetMapping("")
    public String list(Model model){
        List<Book> books = bookRepository.findAll();
        model.addAttribute("books",books);
        return "book/list";
    }
}
