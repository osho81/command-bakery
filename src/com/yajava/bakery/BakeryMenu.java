package com.yajava.bakery;

import com.yajava.cakes.MudCake;
import com.yajava.cakes.PrincessCake;
import com.yajava.cakes.Semla;
import com.yajava.customer.Customer;
import com.yajava.service.Orderlist;

import java.util.Scanner;

/**
 * Class orchestrating the logic of the ordering application.
 * Its menu choices calls on the appropriate process-pipeline for respective cake type.
 */

public class BakeryMenu {

    private final Scanner scan = new Scanner(System.in);

    public void runMenu() throws InterruptedException {

        System.out.println("Welcome to Cakery\nPlease enter your name: ");
        String customerName = scan.nextLine();
        System.out.println("Please enter your SSN/personal ID: ");
        String personalID = scan.nextLine();

        // User input name & gets assigned an ordelist
        Orderlist orderlist = new Orderlist("1001");
        Customer customer = new Customer(customerName, personalID, orderlist);


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
                    MudCake mudCake = (MudCake) BakeryProcess.bakeMudCake(customer, false);
                    mudCake.setStatus("Done");
                    customer.buyItem(mudCake);
                }
                case 3 -> {
                    MudCake mudCakeWhip = (MudCake) BakeryProcess.bakeMudCake(customer, true);
                    mudCakeWhip.setStatus("Done");
                    customer.buyItem(mudCakeWhip);
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
        System.out.println("2. Mud cake");
        System.out.println("3. Mud cake with whip cream");
        System.out.println("4. Princess cake");
        System.out.println("5. See order list");
        System.out.println("6. Exit");
        System.out.print("Val: ");
        System.out.println();
    }
}
