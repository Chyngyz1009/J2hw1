package com.company;

public class Factory {
    private String name;
    private String address;

    public Factory(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }
}
