package Alarm;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DBMS dbms = new DBMS();//creating the object for our DBMS class
        DBMS.getConnect();//call method getconnect
        System.out.println("Set a time:");
        Scanner input = new Scanner(System.in);
        String time = input.nextLine();//user input
        Insert insert = new Insert();//Insert object
        insert.Query(time);//call method Query in class Insert
        Select select = new Select();//Select class object
        LocalTime localTime;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");//create format that shows only hour and minute
        String formattime;

        ArrayList<String> arr = new ArrayList<>();//creating arraylist
        arr = select.Query();//assigning the value of select query

        int counter = 0;
        while (counter != 1) {
            localTime = LocalTime.now();//taking local time
            formattime = localTime.format(formatter);//taking time by format of formatter format
            for (int i = 0; i < arr.size(); i++) {
                if (formattime.equals(arr.get(i).substring(0, 5))) {//cutting string which selected from database
                    counter++;
                    System.out.println("Your time is over!!!");
                }
            }


        }
    }
}
