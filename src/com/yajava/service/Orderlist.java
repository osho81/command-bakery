package com.yajava.service;

import com.yajava.cakes.Cake;

import java.util.ArrayList;
import java.util.List;

public class Orderlist {

    private List<Cake> orders;
    String orderID;

    public Orderlist(String orderID) {
        this.orders = new ArrayList<>();
        this.orderID = orderID;
    }

    public List<Cake> getOrders() {
        return orders;
    }

    public void setOrders(List<Cake> orders) {
        this.orders = orders;
    }

    public void addToOrders(Cake cake) {
        orders.add(cake);
    }

    public void removeFromOrders(Cake cake) {
        orders.remove(cake);
    }

    @Override
    public String toString() {
        return "Order-ID: " + orderID + "\n" + printCakeList();
    }

    // Print out of orderlist in a cleaner manner; used in toString
    private String printCakeList() {
        String cakeStr = "";
        int cakeCount = 1;
        for (Cake cake : orders) {
            cakeStr += (cakeCount++) + ": " + cake + "\n";
        }
        return cakeStr;
    }
}
