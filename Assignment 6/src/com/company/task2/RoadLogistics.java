package com.company.task2;

public class RoadLogistics implements Logistics {
    public Transport createTransport(){
        return new Truck();
    }
}
