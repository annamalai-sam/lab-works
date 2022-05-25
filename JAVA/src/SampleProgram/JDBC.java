package SampleProgram;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
public class JDBC {
    public static void main(String[] args) throws SQLException {
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/java","root","AnnaMalai@19");
        Statement statement = connection.createStatement();
        statement.execute("create table JDBC (id int primary key auto_increment)");
    }
}
