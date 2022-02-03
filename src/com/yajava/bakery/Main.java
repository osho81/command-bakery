package com.yajava.bakery;

import com.yajava.bakecommand.*;
import com.yajava.cakes.Cake;
import com.yajava.cakes.ChocolateCake;
import com.yajava.cakes.PrincessCake;
import com.yajava.cakes.Semla;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        // If create with Cake superclass, then must cast ((Semla) semla1).getSomethingFromChild()
//        Semla semla1 = new Semla("Whipping Semla", 28, 225, 8);
//        ChocolateCake chocoCake1 = new ChocolateCake("Choclomania", 12, 175, 20);
//        PrincessCake princessCake1 = new PrincessCake("Amazing Princess", 32);

//        Cake semla2 = new Semla("Semla exclusive", 41, 225, 8);
//        Cake chocoCake2 = new ChocolateCake("Chocolate cake prime", 5, 175, 20);
//        Cake princessCake2 = new PrincessCake("Amazing Princess", 32);



        // MOVE/HIDE THE BELOW PROCEDURE TO OTHER CLASS, such as ORDER OR cake-classes etc


//        // Create process line for SEMLA
//        System.out.println("\nStarting process of baking a semla\n");
//        ProcessPipeline semlaPipeline = new ProcessPipeline();
//
//        // Add appropriate process-steps/commands
//        semlaPipeline.addCommand(new BunDoughPrepCommand());
//        semlaPipeline.addCommand(new BunDoughFinalizeCommand());
//        semlaPipeline.addCommand(new BunOvenPrepCommand());
//        semlaPipeline.addCommand(new OvenTimeCommand());
//        semlaPipeline.addCommand(new AddAlmonPasteCommand());
//        semlaPipeline.addCommand(new WhippingCreamCommand());
//
//        // Execute the list of process-steps (i.e. pipline)
//        // Cast to child class to e.g. access its toString()
//        semla1 = (Semla) semlaPipeline.execute(semla1);
//        System.out.println(semla1);

        // Doing the job in Bakery class
        Semla semla = (Semla) Bakery.bakeSemla();
        System.out.println(semla);



        // Create process line for CHOCOLATE CAKE
//        System.out.println("\nStarting process of baking a chocolate cake\n");
//        ProcessPipeline chocolateCakePipeline = new ProcessPipeline();

        // Add appropriate process-steps/commands
//        chocolateCakePipeline.addCommand(new MeltButterCommand());
//        chocolateCakePipeline.addCommand(new SoftDoughCommand());
//        chocolateCakePipeline.addCommand(new AddButterCommand());
//        chocolateCakePipeline.addCommand(new SoftDoughOvenPrepCommand());
//        chocolateCakePipeline.addCommand(new OvenTimeCommand());
//        chocolateCakePipeline.addCommand(new AddWhipCommand()); // Deviating from recipe, but OK
//
//        // Execute the list of process-steps (i.e. pipline)
//        chocoCake1 = (ChocolateCake) chocolateCakePipeline.execute(chocoCake1);
//        System.out.println(chocoCake1);

        ChocolateCake chocolateCake = (ChocolateCake) Bakery.bakeChocolateCake();
        System.out.println(chocolateCake);


//        // Create process line for PRINCESS CAKE
//        System.out.println("\nStarting process of baking a princess cake\n");
//        ProcessPipeline princessCakePipeline = new ProcessPipeline();
//
//        // Add appropriate process-steps/commands
//        princessCakePipeline.addCommand(new WhippingCreamCommand());
//        princessCakePipeline.addCommand(new JamOnCakeBaseCommand());
//        princessCakePipeline.addCommand(new VanillaOnCakeBaseCommand());
//        princessCakePipeline.addCommand(new AddWhipCommand());
//        princessCakePipeline.addCommand(new AddToppingCommand());
//        princessCakePipeline.addCommand(new OvenTimeCommand()); // Deviating from recipe
//
//        // Execute the list of process-steps (i.e. pipline)
//        princessCake1 = (PrincessCake) princessCakePipeline.execute(princessCake1);
//
//        // Print out the created cake or up to what has been baked
//        System.out.println(princessCake1);

        PrincessCake princessCake = (PrincessCake) Bakery.bakePrincessCake();
        System.out.println(princessCake);

    }
}
