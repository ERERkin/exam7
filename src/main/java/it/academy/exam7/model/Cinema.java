package it.academy.exam7.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Cinema implements AbstractBook {
    private String name;
    private String address;
    private Integer capacity;
    private String site;

    private static final Cinema instance = new Cinema();

    private Cinema() {
        name = "Нават";
        address = "a";
        capacity = 100;
        site = "s";
    }

    public static AbstractBook getInstance() {
        return instance;
    }
}
