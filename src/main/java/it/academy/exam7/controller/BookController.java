package it.academy.exam7.controller;

import it.academy.exam7.model.AbstractBook;
import it.academy.exam7.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.awt.print.Book;

@RestController
@RequestMapping("/book")
public class BookController {
    @Autowired
    BookService bookService;

    @GetMapping("/{code}")
    AbstractBook getBook(@PathVariable("code") String letter){
        return bookService.getBook(letter);
    }
}
