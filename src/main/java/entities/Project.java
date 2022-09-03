package entities;

import lombok.Data;

public @Data class Project {
    private long id;
    private String name;
    private String timeOfCreation;
    private long customer;
    private long company;

    public Project(String name, String timeOfCreation) {
        this.name = name;
        this.timeOfCreation = timeOfCreation;
    }

    public Project(String name, String timeOfCreation, long customer, long company) {
        this.name = name;
        this.timeOfCreation = timeOfCreation;
        this.customer = customer;
        this.company = company;
    }
}
