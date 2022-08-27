import CrudServices.CustomerCrudService;
import CrudServices.DeveloperCrudService;

import java.sql.SQLException;


public class Main {
    public static void main(String[] args) throws SQLException {
        System.out.println("CustomerCrudService.getAllCustomers() = " + CustomerCrudService.getAllCustomers());
    }
}
