package com.company.task1;
import java.sql.*;
public class Database {
    private static Database instance;

    private Database(){

    }
    public static Database getInstance(){
        if(instance==null){
            instance=new Database();
        }
        return instance;
    }
    public void query(String sql){
        String connectionUrl="jdbc:postgresql://localhost:5432/Informationdatabase";
        Connection connection=null;
        ResultSet  resultSet=null;
        Statement statement=null;
        try {
            Class.forName("org.postgresql.Driver");
            connection=DriverManager.getConnection(connectionUrl,"postgres","135790");
            statement=connection.createStatement();
            resultSet=statement.executeQuery(sql);
            while(resultSet.next()){
                System.out.println(resultSet.getString("Name")+" "+resultSet.getString("Title")+" "+resultSet.getString("Name"));
            }
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
