package com.company.task3;

public class PCFactory implements ComputingMachineAbstractFactory{
    private String ram;
    private String ssd;
    private String cpu;

    public PCFactory(String ram, String ssd, String cpu){
        this.ram=ram;
        this.ssd=ssd;
        this.cpu=cpu;
    }
    @Override
    public ComputingMachine createComputingMachine(){
        return new PC(ram,ssd,cpu);
    }
}
