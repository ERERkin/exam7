package it.academy.exam7.service.impl;

import it.academy.exam7.entity.Log;
import it.academy.exam7.model.AbstractBook;
import it.academy.exam7.model.Cinema;
import it.academy.exam7.model.Restaurant;
import it.academy.exam7.model.Ticket;
import it.academy.exam7.repos.LogRepo;
import it.academy.exam7.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;

@Service
public class BookServiceImpl implements BookService {
    @Autowired
    LogRepo logRepo;
    @Override
    public AbstractBook getBook(String letter) {
        Log log = Log.builder()
                .name(letter)
                .timestamp(new Timestamp(System.currentTimeMillis()))
                .build();
        if(letter.equals("C")) {
            logRepo.save(log);
            //Хотел один раз поставить, но тогда он будет сохранять и правильные
            return Cinema.getInstance();
        }
        else if(letter.equals("R")){
            logRepo.save(log);
            return Restaurant.getInstance();
        }
        else if(letter.equals("T")) {
            logRepo.save(log);
            return Ticket.getInstance();
        }
        return null;
    }
}
