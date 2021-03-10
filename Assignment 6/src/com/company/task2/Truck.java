package com.company.task2;

import com.company.task2.Transport;

public class Truck implements Transport {
    @Override
    public void deliver() {
        System.out.println("Delivery by land in a crate");
    }
}

