package com.yajava.cakes;

public abstract class Cake {
    private String cakeName;
    private int cakeID;

    public Cake(String cakeName, int cakeID) {
        this.cakeName = cakeName;
        this.cakeID = cakeID;
    }

    public String getCakeName() {
        return cakeName;
    }
    public void setCakeName(String cakeName) {
        this.cakeName = cakeName;
    }
    public int getCakeID() {
        return cakeID;
    }
    public void setCakeID(int cakeID) {
        this.cakeID = cakeID;
    }

    @Override
    public String toString() {
        return "Cake name: " + cakeName + ", cake-ID: " + cakeID;
    }
}


