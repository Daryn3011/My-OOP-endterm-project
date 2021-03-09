package Alarm;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBMS {


    public static Connection getConnect() {//creating method getconnect
        String url = "jdbc:postgresql://localhost:5432/Javaproject";
        String username = "postgres";
        String password = "135790";

        {
            try {
                Connection connection = DriverManager.getConnection(url, username, password);//connection to database
                return connection;//returning connection

            } catch (SQLException throwables) {
                throwables.printStackTrace();
                return null;
            }
        }
    }
}
