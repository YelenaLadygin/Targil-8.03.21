package com.company;

public class Apartment {
    private String address;
    protected double size;

    @Override
    public String toString() {
        return "Apartment{" +
                "address='" + address + '\'' +
                ", size=" + size +
                '}';
    }
}
