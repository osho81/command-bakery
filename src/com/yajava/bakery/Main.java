package com.yajava.bakery;

import com.yajava.customer.Customer;
import com.yajava.service.Orderlist;

/**
 * YrkesAkademin, System Acrhitecture course, VT2022
 * Inlämning 1 (hand-in 1)
 * Teacher: Tomas Wigell
 *
 *  Applicaton simulating a bakery, where customer can order several cake types.
 *  Applies Command pattern & Observer pattern.
 */

public class Main {

    public static void main(String[] args) throws InterruptedException {

        // Shortening the process, thus creating the customer and ordelist here in Main
        Orderlist orderlist = new Orderlist("1001");
        Customer customer = new Customer("Donald Duck", "123456789", orderlist);

        // Pass in the customer (and assigned orderlist) to the application logic in BakeryManu
        BakeryMenu bakeryMenu = new BakeryMenu();
        bakeryMenu.runMenu(customer);
    }
}
