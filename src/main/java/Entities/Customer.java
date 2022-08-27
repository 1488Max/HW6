package Entities;

import lombok.Data;

public @Data class Customer {
    protected long id;
    protected String name;
    protected String surname;

    public Customer(long id, String name, String surname) {
        this.id = id;
        this.name = name;
        this.surname = surname;
    }

    public Customer(String name, String surname) {
        this.name = name;
        this.surname = surname;

    }
}