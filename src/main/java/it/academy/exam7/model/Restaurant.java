package it.academy.exam7.model;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Restaurant implements AbstractBook{
    private String name;
    private String address;
    private String specialtyFood;
    private String site;

    private static final Restaurant instance = new Restaurant();

    public Restaurant() {
        name = "Нават";
        address = "a";
        specialtyFood = "s";
        site = "s";
    }

    public static AbstractBook getInstance() {
        return instance;
    }
}
