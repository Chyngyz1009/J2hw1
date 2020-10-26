package com.company;

public final class Moto extends Truck {

    private int places;
    private int wheels;

    public Moto(String name, Factory factory, double volume, Color color, int places, int wheels) {
        super(name, factory, volume, color);
        this.places = places;
        this.wheels = wheels;
    }

    public int getPlaces() {
        return places;
    }

    public int getWheels() {
        return wheels;
    }

    @Override
    public String getInfo() {
        return super.getInfo()+
                "\nPlaces = " +places +
                "\nWheels = " +wheels;
    }
}
