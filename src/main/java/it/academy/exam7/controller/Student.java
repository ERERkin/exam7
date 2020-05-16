package it.academy.exam7.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/student")
public class Student {
    @PostMapping
    public Student save(@RequestBody Student student){
        return null;
    }

    @GetMapping("/find")
    @ResponseBody
    public Student getByName(String name){
        return null;
    }

    @GetMapping("/{id}")
    public Student getById(@PathVariable("id") Long id) {
        return null;
    }
}
