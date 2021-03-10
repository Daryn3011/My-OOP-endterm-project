package com.company.task4;

public class House {
    int walls;
    int doors;
    int windows;
    int roofs;
    boolean garage;
    boolean swimpool;
    boolean statues;
    boolean garden;

    public void setWalls(int walls) {
        this.walls = walls;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public void setWindows(int windows) {
        this.windows = windows;
    }

    public void setRoof(int roofs) {
        this.roofs = roofs;
    }

    public void setGarage(boolean garage) {
        this.garage = garage;
    }

    public void setSwimpool(boolean swimpool) {
        this.swimpool = swimpool;
    }

    public void setStatues(boolean statues) {
        this.statues = statues;
    }

    public void setGarden(boolean garden) {
        this.garden = garden;
    }

    @Override
    public String toString() {
        return  "Walls of house: " + walls + "\nDoor of house: " + doors + "\nWindows of house: " + windows + "\nRoof of house: " + roofs + "\nGarage: " + garage + "\nSwimming pool: " + swimpool + "\nStatues: " + statues + "\nGarden of house: " + garden;
    }
}


