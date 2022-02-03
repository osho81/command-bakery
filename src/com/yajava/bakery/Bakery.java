package com.yajava.bakery;

import com.yajava.bakecommand.*;
import com.yajava.cakes.Cake;
import com.yajava.cakes.ChocolateCake;
import com.yajava.cakes.PrincessCake;
import com.yajava.cakes.Semla;

// Static methods utilizing respective process pipeline and its appropriate commands

public class Bakery {

    public static Cake bakeSemla() throws InterruptedException {
        System.out.println("\nStarting process of baking a semla\n");

        Semla semla = new Semla("Whipping Semla", 20, 225, 8);

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
    public static Cake bakeChocolateCake(boolean whipOrNot) throws InterruptedException {
        String startingText = whipOrNot ? "\nStarting process of baking a chocolate cake with whip cream\n" :
                "\nStarting process of baking a chocolate cake without whip cream\n";
        System.out.println(startingText);

        ChocolateCake chocoCake = new ChocolateCake("Choclomania", 12, 175, 20);

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

    public static Cake bakePrincessCake() throws InterruptedException {
        System.out.println("\nStarting process of baking a princess cake\n");

        PrincessCake princessCake1 = new PrincessCake("Amazing Princess", 32);

        // Create process line for PRINCESS CAKE
        ProcessPipeline princessCakePipeline = new ProcessPipeline();

        // Add appropriate process-steps/commands
        princessCakePipeline.addCommand(new WhippingCreamCommand());
        princessCakePipeline.addCommand(new JamOnCakeBaseCommand());
        princessCakePipeline.addCommand(new VanillaOnCakeBaseCommand());
        princessCakePipeline.addCommand(new AddWhipCommand());
        princessCakePipeline.addCommand(new AddToppingCommand());

        // Execute the list of process-steps (i.e. pipline)
        return (PrincessCake) princessCakePipeline.execute(princessCake1);

    }

}
