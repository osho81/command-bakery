package com.yajava.customer;

import com.yajava.cakes.Cake;
import com.yajava.services.Orderlist;

import java.util.ArrayList;
import java.util.List;

public class Customer extends Person {

    private Orderlist orderlist;

    public Customer(String name, String personID, Orderlist orderlist) {
        super(name, personID);
        this.orderlist = orderlist;
    }

    public Orderlist getOrderlist() {
        return orderlist;
    }

    public void setOrderlist(Orderlist orderlist) {
        this.orderlist = orderlist;
    }
}
