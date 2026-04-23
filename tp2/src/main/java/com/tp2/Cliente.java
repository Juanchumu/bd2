package com.tp2;

// Cliente.java
public class Cliente {
    private int id;
    private String descr;

    public Cliente(int id, String descr) {
        this.id = id;
        this.descr = descr;
    }

    public int getId() { return id; }
    public String getDescr() { return descr; }
}
