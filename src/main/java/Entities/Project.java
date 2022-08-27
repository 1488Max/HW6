package Entities;

import lombok.Data;

public @Data class Project {
    protected long id;
    protected String name;
    protected String timeOfCreation;
    protected long customerId;
    protected long companyId;

    public Project(String name, String timeOfCreation) {
        this.name = name;
        this.timeOfCreation = timeOfCreation;
    }

    public Project(String name, String timeOfCreation, long customerId, long companyId) {
        this.name = name;
        this.timeOfCreation = timeOfCreation;
        this.customerId = customerId;
        this.companyId = companyId;
    }
}
