package com.company.task3;

public class PhoneFactory implements ComputingMachineAbstractFactory{
    private String ram;
    private String ssd;
    private String cpu;

    public PhoneFactory(String ram, String ssd, String cpu){
        this.ram = ram;
        this.ssd = ssd;
        this.cpu = cpu;
    }
    @Override
    public ComputingMachine createComputingMachine(){
        return new Phone(ram,ssd,cpu);
    }
}
