package bybellhard.j19.lessons.lesson11.Enternal;

import java.sql.SQLException;

public class Main1 {
    public static void main(String[] args) throws SQLException {

        EmployeesService employeesService = new EmployeesService();
        employeesService.addNewEmployee("Victor", 5000, 1);
    }
}
