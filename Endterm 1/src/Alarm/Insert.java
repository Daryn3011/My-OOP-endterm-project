package Alarm;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Insert extends DBMS implements SQL {//extends DBMS class and implements methods of SQL interface class
    public static void Query(String element) {//implementing and overriding method from SQl class

        try {//trying
            Connection conn = getConnect();//assigning the value of method getConnect to conn
            String query1 = "Insert into times(Gtime) values('"+element+"');";//Inserting query
            Statement statement = conn.createStatement();//creating statement
            statement.executeUpdate(query1);//performing query

        }catch (SQLException e){//error catching
            System.out.println("Error in inserting element!!!");
            e.printStackTrace();

        }

    }
}
