package it.academy.exam7.service;

import it.academy.exam7.model.AbstractBook;
import org.springframework.stereotype.Service;


public interface BookService {
    AbstractBook getBook(String letter);
}
