package com.company;

public class Avto {
    private String name;
    private Factory factory;

    public Avto(String name, Factory factory) {
        this.name = name;
        this.factory = factory;
    }

    public String getName() {
        return name;
    }

    public Factory getFactory() {
        return factory;
    }

    public String getInfo() {
        return "__________________________________" +
                "\nAvto = " + name+
                "\nFactory name  = "+ factory.getName()+
                "\nAdress="+ factory.getAddress();

    }
}
