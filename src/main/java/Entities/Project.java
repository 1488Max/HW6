package Entities;

import lombok.Data;

public @Data class Project {
    protected long id;
    protected String name;
    protected String time_of_creation;
    protected long customer_id;
    protected long company_id;

    public Project(String name, String time_of_creation) {
        this.name = name;
        this.time_of_creation = time_of_creation;
    }

    public Project(String name, String time_of_creation, long customer_id, long company_id) {
        this.name = name;
        this.time_of_creation = time_of_creation;
        this.customer_id = customer_id;
        this.company_id = company_id;
    }
}
