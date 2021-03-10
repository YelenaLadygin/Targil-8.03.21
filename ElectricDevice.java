package com.company;

public abstract class ElectricDevice {

    protected  float voltage;
    protected boolean worksOnBatteries;
    protected boolean isFaulty;

    public ElectricDevice(boolean worksOnBatteries) {
        this.worksOnBatteries = worksOnBatteries;
        this.isFaulty= false;
    }
    public void turnOn (){
        System.out.println("Turning device on");
    }
    public final void insertNewBatteries (){
        if (worksOnBatteries=true){
            System.out.println(" Inserting new batteries to the device");
        }
        else System.out.println("This device does not use batteries");
    }
    public abstract void useDevice();
    public abstract void fixDevice();
}