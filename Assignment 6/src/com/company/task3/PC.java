package com.company.task3;

public class PC extends ComputingMachine {
    private String ram;
    private String ssd;
    private String cpu;

    public PC(String ram, String hdd, String cpu){
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
