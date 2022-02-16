package com.yajava.bakery;

/**
 * Osho81
 * YrkesAkademin, System Acrhitecture course, VT2022
 * Inlämning 1 (hand-in 1)
 * Teacher: Tomas Wigell
 *
 *  Applicaton simulating a bakery, where customer can order several cake types.
 *  Applies Command pattern & Observer pattern.
 */

public class Main {

    public static void main(String[] args) throws InterruptedException {

        // Create and run the application logic in BakeryManu
        BakeryMenu bakeryMenu = new BakeryMenu();
        bakeryMenu.runMenu();
    }
}
