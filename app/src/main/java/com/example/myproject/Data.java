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

    @Override
    public String toString() { return name; }
}