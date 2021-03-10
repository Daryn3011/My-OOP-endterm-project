package com.company.task3;

public class ComputingMachineFactory {
    public static ComputingMachine getComputer(ComputingMachineAbstractFactory factory){
        return factory.createComputingMachine();
    }
}
