package it.academy.exam7.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Ticket implements AbstractBook {
    private String name;
    private String paymentMethod;
    private String site;

    private static final Ticket instance = new Ticket();

    private Ticket() {
        name = "Нават";
        paymentMethod = "p";
        site = "s";
    }

    public static AbstractBook getInstance() {
        return instance;
    }
}
