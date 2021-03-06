package com.company.task3;

public class Phone extends ComputingMachine{
    private String ram;
    private String ssd;
    private String cpu;

    public Phone(String ram, String ssd, String cpu){
        this.ram=ram;
        this.ssd=ssd;
        this.cpu=cpu;
    }
    @Override
    public String getRAM() {
        return this.ram;
    }

    @Override
    public String getSSD() {
        return this.ssd;
    }

    @Override
    public String getCPU() {
        return this.cpu;
    }
}

