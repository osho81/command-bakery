package com.yajava.bakery;

import com.yajava.bakecommand.*;
import com.yajava.cakes.Cake;
import com.yajava.cakes.ChocolateCake;
import com.yajava.cakes.PrincessCake;
import com.yajava.cakes.Semla;
import com.yajava.customer.Customer;
import com.yajava.service.BakingControl;

// Class with static methods utilizing respective process pipeline and its appropriate commands

public class BakeryProcess {

    // Accessible by all methods in this class
    private static BakingControl bakingControl = new BakingControl();

    public static Cake bakeSemla(Customer customer) throws InterruptedException {
        System.out.println("\nStarting process of baking a semla");

        Semla semla = new Semla("Whipping Semla", customer.getOrderlist().getOrders().size()+1, 225, 8);

        // Part of Observer pattern for listening on incoming orders
        // (See BakeryMenu class for listener of undone or done status)
        semla.addPropertyChangeListener(bakingControl); // Add property-change/observing methods
        semla.setOrdered(true); // Trigger property-change/observing methods when order starts
        System.out.println();

        // Create process line for SEMLA
        ProcessPipeline semlaPipeline = new ProcessPipeline();

        // Add appropriate process-steps/commands
        semlaPipeline.addCommand(new BunDoughPrepCommand());
        semlaPipeline.addCommand(new BunDoughFinalizeCommand());
        semlaPipeline.addCommand(new BunOvenPrepCommand());
        semlaPipeline.addCommand(new OvenTimeCommand());
        semlaPipeline.addCommand(new AddAlmonPasteCommand());
        semlaPipeline.addCommand(new WhippingCreamCommand());
        semlaPipeline.addCommand(new AddToppingCommand());

        // Execute the list of process-steps (i.e. pipline)
        return semlaPipeline.execute(semla);
    }

    // Method for baking a chocolate cake - with or without whip cream
    public static Cake bakeChocolateCake(Customer customer, boolean whipOrNot) throws InterruptedException {
        String startingText = whipOrNot ? "\nStarting process of baking a chocolate cake with whip cream\n" :
                "\nStarting process of baking a chocolate cake without whip cream";
        System.out.println(startingText);

        ChocolateCake chocoCake = new ChocolateCake("Choclomania", customer.getOrderlist().getOrders().size()+1, 175, 20);

        chocoCake.addPropertyChangeListener(bakingControl);
        chocoCake.setOrdered(true);
        System.out.println();

        // Create process line for CHOCOLATE CAKE
        ProcessPipeline chocolateCakePipeline = new ProcessPipeline();

        // Add appropriate process-steps/commands
        chocolateCakePipeline.addCommand(new MeltButterCommand());
        chocolateCakePipeline.addCommand(new SoftDoughCommand());
        chocolateCakePipeline.addCommand(new AddButterCommand());
        chocolateCakePipeline.addCommand(new SoftDoughOvenPrepCommand());
        chocolateCakePipeline.addCommand(new OvenTimeCommand());
        if (whipOrNot)
            chocolateCakePipeline.addCommand(new AddWhipCommand());

        // Execute the list of process-steps (i.e. pipline)
        return (ChocolateCake) chocolateCakePipeline.execute(chocoCake);
    }

    public static Cake bakePrincessCake(Customer customer) throws InterruptedException {
        System.out.println("\nStarting process of baking a princess cake");

        PrincessCake princessCake = new PrincessCake("Amazing Princess", customer.getOrderlist().getOrders().size()+1);

        princessCake.addPropertyChangeListener(bakingControl);
        princessCake.setOrdered(true);
        System.out.println();

        // Create process line for PRINCESS CAKE
        ProcessPipeline princessCakePipeline = new ProcessPipeline();

        // Add appropriate process-steps/commands
        princessCakePipeline.addCommand(new WhippingCreamCommand());
        princessCakePipeline.addCommand(new JamOnCakeBaseCommand());
        princessCakePipeline.addCommand(new VanillaOnCakeBaseCommand());
        princessCakePipeline.addCommand(new AddWhipCommand());
        princessCakePipeline.addCommand(new AddToppingCommand());

        // Execute the list of process-steps (i.e. pipline)
        return (PrincessCake) princessCakePipeline.execute(princessCake);

    }

}
