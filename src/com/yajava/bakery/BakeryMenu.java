package com.yajava.bakery;

import com.yajava.cakes.ChocolateCake;
import com.yajava.cakes.PrincessCake;
import com.yajava.cakes.Semla;
import com.yajava.customer.Customer;
import java.util.Scanner;

/**
 * Class orchestrating the logic of the ordering application.
 * Its menu choices calls on the appropriate process-pipeline for respective cake type.
 */

public class BakeryMenu {

    private final Scanner scan = new Scanner(System.in);

    public void runMenu(Customer customer) throws InterruptedException {

        System.out.println("Welcome to Cakery");

        int menuChoice = 0;
        while (menuChoice != 6) {

            printMenu();
            menuChoice = readInt();

            switch (menuChoice) {
                case 1 -> {
                    // Create cake chosen by customer
                    Semla semla = (Semla) BakeryProcess.bakeSemla(customer);

                    // Trigger property-change when order is done; Observer/Listener added in BakeryProcess
                    semla.setStatus("Done");

                    // Buy done cake, via method in Customer class
                    customer.buyItem(semla);
                }
                case 2 -> {
                    ChocolateCake chocolateCake = (ChocolateCake) BakeryProcess.bakeChocolateCake(customer, false);
                    chocolateCake.setStatus("Done");
                    customer.buyItem(chocolateCake);
                }
                case 3 -> {
                    ChocolateCake chocolateCakeWhip = (ChocolateCake) BakeryProcess.bakeChocolateCake(customer, true);
                    chocolateCakeWhip.setStatus("Done");
                    customer.buyItem(chocolateCakeWhip);
                }
                case 4 -> {
                    PrincessCake princessCake = (PrincessCake) BakeryProcess.bakePrincessCake(customer);
                    princessCake.setStatus("Done");
                    customer.buyItem(princessCake);
                }
                case 5 -> System.out.println("Customer name: " + customer.getName() + ", customer-ID: " + customer.getPersonID() + "\n" + customer.getOrderlist());
                case 6 -> {
                    System.out.println("Exiting the ordering application - Thank You!");
                }
                // Default case captures choices outside 1-6; Data type validation is done in readInt() method
                default -> System.out.println("Invalid choice (only 1-6 allowed);\nTry again: ");
            }
        }

        // Exit system, after leaving the while-loop due to menuChoice 6
        System.exit(0);
    }

    // Validates that input is integer-number
    private int readInt() {
        int count = 0;
        while (!scan.hasNextInt()) {
            scan.nextLine(); // Consumes empty "leftovers" from scanner

            // Limit wrong inputs to three
            count++;
            if (count == 3) {
                System.out.print("What an annoying customer!\nGood by!");
                System.exit(0);
            } else {
                System.out.print("Invalid input;\nTry again: ");
            }
        }

        // If input is integer-number, accept it and return it
        int choice = scan.nextInt();
        scan.nextLine();
        return choice;
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
