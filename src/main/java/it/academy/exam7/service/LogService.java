package it.academy.exam7.service;

import it.academy.exam7.entity.Log;
import org.springframework.stereotype.Service;

import java.util.List;


public interface LogService {
    Log save(Log log);

    List<Log> getAll();
}
