package com.company;

public class TV extends ElectricDevice {
    protected float screen_size;

    public TV(boolean worksOnBatteries, float screen_size) {
        super(false);
        this.screen_size = screen_size;
    }

    @Override
    public void useDevice() {
        System.out.println("watching TV");
    }

    @Override
    public void fixDevice() {
        if (isFaulty = true) {
            System.out.println(" fixing TV");
        } else System.out.println("this TV is working properly");
    }
}