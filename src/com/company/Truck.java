package com.company;

public class Truck extends Avto {
    private double volume;
    private Color color;

    public Truck(String name, Factory factory, double volume, Color color) {
        super(name, factory);
        this.volume = volume;
        this.color = color;
    }

    public double getVolume() {
        return volume;
    }

    public Color getColor() {
        return color;
    }
    public void makeVoice(String voice, int num) {
        for (int i = 0; i < num; i++) {
            System.out.println(voice);
        }
    }

    public void makeVoice(int num, String voice) {
        for (int i = 0; i < num; i++) {
            System.out.println(voice);
        }
    }

    public final void makeVoice(String voice) {
        System.out.println(voice);

    }

    @Override
    public String getInfo() {
        return super.getInfo()+
                "\nVolume = " +volume +
                 "\nGreen = " +color;
    }
}
