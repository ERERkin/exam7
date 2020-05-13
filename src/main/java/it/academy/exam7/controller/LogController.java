package it.academy.exam7.controller;

import it.academy.exam7.entity.Log;
import it.academy.exam7.service.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/log")
public class LogController {
    @Autowired
    LogService logService;

    public List<Log> getAll(){
        return logService.getAll();
    }
}
