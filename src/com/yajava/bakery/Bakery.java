package com.yajava.bakery;

import com.yajava.bakecommand.*;
import com.yajava.cakes.Cake;
import com.yajava.cakes.ChocolateCake;
import com.yajava.cakes.PrincessCake;
import com.yajava.cakes.Semla;

public class Bakery {

    public static Cake bakeSemla() throws InterruptedException {

        Semla semla = new Semla("Whipping Semla", 20, 225, 8);

        // Create process line for SEMLA
        System.out.println("\nStarting process of baking a semla\n");
        ProcessPipeline semlaPipeline = new ProcessPipeline();

        // Add appropriate process-steps/commands
        semlaPipeline.addCommand(new BunDoughPrepCommand());
        semlaPipeline.addCommand(new BunDoughFinalizeCommand());
        semlaPipeline.addCommand(new BunOvenPrepCommand());
        semlaPipeline.addCommand(new OvenTimeCommand());
        semlaPipeline.addCommand(new AddAlmonPasteCommand());
        semlaPipeline.addCommand(new WhippingCreamCommand());

        // Execute the list of process-steps (i.e. pipline)
        return semlaPipeline.execute(semla);
    }

    public static Cake bakeChocolateCake() throws InterruptedException {

        ChocolateCake chocoCake = new ChocolateCake("Choclomania", 12, 175, 20);

        // Create process line for CHOCOLATE CAKE
        System.out.println("\nStarting process of baking a chocolate cake\n");
        ProcessPipeline chocolateCakePipeline = new ProcessPipeline();

        // Add appropriate process-steps/commands
        chocolateCakePipeline.addCommand(new MeltButterCommand());
        chocolateCakePipeline.addCommand(new SoftDoughCommand());
        chocolateCakePipeline.addCommand(new AddButterCommand());
        chocolateCakePipeline.addCommand(new SoftDoughOvenPrepCommand());
        chocolateCakePipeline.addCommand(new OvenTimeCommand());
        chocolateCakePipeline.addCommand(new AddWhipCommand()); // Deviating from recipe, but OK

        // Execute the list of process-steps (i.e. pipline)
        return (ChocolateCake) chocolateCakePipeline.execute(chocoCake);
    }

    public static Cake bakePrincessCake() throws InterruptedException {

        PrincessCake princessCake1 = new PrincessCake("Amazing Princess", 32);

        // Create process line for PRINCESS CAKE
        System.out.println("\nStarting process of baking a princess cake\n");
        ProcessPipeline princessCakePipeline = new ProcessPipeline();

        // Add appropriate process-steps/commands
        princessCakePipeline.addCommand(new WhippingCreamCommand());
        princessCakePipeline.addCommand(new JamOnCakeBaseCommand());
        princessCakePipeline.addCommand(new VanillaOnCakeBaseCommand());
        princessCakePipeline.addCommand(new AddWhipCommand());
        princessCakePipeline.addCommand(new AddToppingCommand());
        princessCakePipeline.addCommand(new OvenTimeCommand()); // Deviating from recipe

        // Execute the list of process-steps (i.e. pipline)
        return (PrincessCake) princessCakePipeline.execute(princessCake1);

    }

}
