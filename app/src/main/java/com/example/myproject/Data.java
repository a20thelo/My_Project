package com.example.myproject;

public class Data {
    private String ID;
    private String name;
    private String type;
    private String company;
    private String location;
    private String category;
    private int size;
    private String cost;
    private Auxdata auxdata;

    public String getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public String getLocation() {
        return location;
    }

    public int getSize() {
        return size;
    }


    @Override
    public String toString() { return name; }
}