package bybellhard.j19.lessons.lesson11.Enternal;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class EmployeesService {
    private  static final String INSERT_NEW_USER_QERRY =
            "insert into employees value(null,?,default,?,?)";

    private class EmployeesSevice{

        private DBManager dbManager;

        public EmployeesService()throws SQLException{
            this.dbManager = new DBManager();
        }
        public void addNewEmployee(String name, int salary, int specialtyId)throws SQLException{
            Connection connection = dbManager.getConnection();
            PreparedStatement statement = connection.prepareStatement(INSERT_NEW_USER_QERRY);
            statement.setString(1,name);
            statement.setInt(2,salary);
            statement.setInt(3,specialtyId);


            statement.execute();
        }
    }
}

