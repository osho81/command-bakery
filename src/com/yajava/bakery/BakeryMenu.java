package com.yajava.bakery;

import com.yajava.cakes.ChocolateCake;
import com.yajava.cakes.PrincessCake;
import com.yajava.cakes.Semla;
import com.yajava.customer.Customer;

import java.util.Scanner;

public class BakeryMenu {

    private Scanner scan = new Scanner(System.in);

    public void runMenu(Customer customer) throws InterruptedException {

        int menuChoice = 0;
        while (menuChoice != 6) {

            printMenu();
            menuChoice = readInt();

            switch (menuChoice) {
                case 1 -> {
                    Semla semla = (Semla) Bakery.bakeSemla();
                    customer.buyItem(semla);
                }
                case 2 -> {
                    ChocolateCake chocolateCake = (ChocolateCake) Bakery.bakeChocolateCake(false);
                    customer.buyItem(chocolateCake);
                }
                case 3 -> {
                    ChocolateCake chocolateCake = (ChocolateCake) Bakery.bakeChocolateCake(true);
                    customer.buyItem(chocolateCake);
                }
                case 4 -> {
                    PrincessCake princessCake = (PrincessCake) Bakery.bakePrincessCake();
                    customer.buyItem(princessCake);
                }
                case 5 -> System.out.println("Customer name/IO: " + customer.getName() + "/" + customer.getPersonID() + "\n" + customer.getOrderlist());
                case 6 -> {
                    System.out.println("Exiting...");
                    System.exit(1);
                }
                default -> System.out.println("Invalid choice");
            }
        }
    }

    private int readInt() {
        while (!scan.hasNextInt()) {
            scan.nextLine();
            System.out.print("Invalid input \nTry again: ");
        }
        int chosenInt = scan.nextInt();
        scan.nextLine();
        return chosenInt;
    }

    private void printMenu() {
        System.out.println();
        System.out.println("1. Semla");
        System.out.println("2. Chocolate cake");
        System.out.println("3. Chocolate cake with whip cream");
        System.out.println("4. Princess cake");
        System.out.println("5. See order list");
        System.out.println("6. Exit");
        System.out.print("Val: ");
        System.out.println();
    }
}
