package com.company.task4;

public class Housebuilder {
    int wall;
    int door;
    int window;
    int roof;
    boolean garage1;
    boolean swimpool1;
    boolean statues;
    boolean garden1;
    public Housebuilder buildwalls(int walls){
        this.wall = walls;
        return this;
    }
    public Housebuilder builddoors(int doors){
        this.door = doors;
        return this;
    }
    public Housebuilder buildwindows(int windows){
        this.window = windows;
        return this;
    }
    public Housebuilder buildroof(int roof){
        this.roof = roof;
        return this;
    }
    public Housebuilder hasGarage(boolean garage){
        this.garage1 = garage;
        return this;
    }
    public Housebuilder hasStatues(boolean statues){
        this.statues = statues;
        return this;
    }
    public Housebuilder hasGarden(boolean garden){
        this.garden1 = garden;
        return this;
    }
    public Housebuilder hasSwimpool(boolean swimpool){
        this.swimpool1 = swimpool;
        return this;
    }
    public House build(){
        House house=new House();
        house.setWalls(wall);
        house.setDoors(door);
        house.setWindows(window);
        house.setRoof(roof);
        house.setGarage(garage1);
        house.setSwimpool(swimpool1);
        house.setStatues(statues);
        house.setGarden(garden1);
        return house;
    }
}
/*abstract class Houseebuilder{
    House house;
    void createHouse(){
        house=new House();
    }
    abstract Houseebuilder buildwalls(int walls);
    abstract Houseebuilder builddoors(int doors);
    abstract Houseebuilder buildwindows(int windows);
    abstract Houseebuilder buildroof(int roofs);
    abstract Houseebuilder hasGarage(boolean garage);
    abstract Houseebuilder hasStatues(boolean statues);
    abstract Houseebuilder hasGarden(boolean garden);
    House getHouse(){
        return house;
    }
}*/

