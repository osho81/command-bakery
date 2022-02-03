package com.yajava.customer;

import com.yajava.cakes.Cake;
import com.yajava.service.Orderlist;

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

    // Method for buying a cake
    public void buyItem(Cake cake) {
        orderlist.addToOrders(cake);
    }

}
