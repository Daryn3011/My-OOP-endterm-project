package com.company.task2;

public class SeaLogistics implements Logistics {
    public Transport createTransport (){
        return new Ship();
    }
}
