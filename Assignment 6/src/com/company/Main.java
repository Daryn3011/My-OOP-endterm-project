package com.company;
import com.company.task4.House;
import com.company.task4.Housebuilder;

public class Main {

    public static void main(String[] args) {
        //Task number 1
   /*Database foo=Database.getInstance();
   foo.query("select *from user1");
      System.out.println("========================");
   Database bar=Database.getInstance();
   bar.query("select *from user1");*/
        //Task number 2
        /*  Logistics logistics=new SeaLogistics();
      //Logistics logistics=new RoadLogistics();
          Transport transport=logistics.createTransport();
          transport.deliver();*/
        //Task number 4
        House house=new Housebuilder()
                .buildwalls(4)
                .builddoors(2)
                .buildroof(1)
                .buildwindows(5)
                .hasGarage(true)
                .hasGarden(false)
                .hasStatues(true)
                .hasSwimpool(false)
                .build();
        System.out.println(house);

    }
}