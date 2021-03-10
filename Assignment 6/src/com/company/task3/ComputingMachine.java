package com.company.task3;

public abstract class ComputingMachine {
    public abstract String getRAM();
    public abstract String getSSD();
    public abstract String getCPU();

    @Override
    public String toString(){
        return "RAM: "+this.getRAM()+", HDD: "+this.getSSD()+", CPU: "+this.getCPU();
    }
}
