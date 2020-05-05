package it.academy.exam7.service.impl;

import it.academy.exam7.entity.Log;
import it.academy.exam7.repos.LogRepo;
import it.academy.exam7.service.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LogServiceImpl implements LogService {
    @Autowired
    private LogRepo logRepo;


    @Override
    public Log save(Log log) {
        return logRepo.save(log);
    }

    @Override
    public List<Log> getAll() {
        return logRepo.findAll();
    }
}
