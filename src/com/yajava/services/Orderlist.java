package com.yajava.services;

import com.yajava.cakes.Cake;

import java.util.ArrayList;
import java.util.List;

public class Orderlist {

    private List<Cake> orders;

    public Orderlist() {
        this.orders = new ArrayList<>();
    }

    public List<Cake> getOrders() {
        return orders;
    }

    public void setOrders(List<Cake> orders) {
        this.orders = orders;
    }
}
