package Alarm;

import java.sql.*;
import java.util.ArrayList;

public class Select extends DBMS {
    public static ArrayList<String> Query(){
        try {//trying
            Connection conn = getConnect();//get connection
            String query1 = "Select Gtime From times;";//selecting query
            Statement statement = conn.createStatement();//creating statement
            ResultSet rs = statement.executeQuery(query1);//assigning output of query to result

            ArrayList<String> arr = new ArrayList<>();//creating arraylist
            while (rs.next()){

                arr.add(rs.getString("Gtime"));//inserting step by step to arraylist
            }




                return arr;//returning arraylist

        }catch (SQLException e){//catch error
            System.out.println("Error in inserting element!!!");
            e.printStackTrace();
                  return null;
        }
    }
}
