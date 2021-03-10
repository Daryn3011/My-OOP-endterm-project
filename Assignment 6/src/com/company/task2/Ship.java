package com.company.task2;

public class Ship implements Transport {
    @Override
    public void deliver() {
        System.out.println("Delivery by sea in a crate");
    }
}
