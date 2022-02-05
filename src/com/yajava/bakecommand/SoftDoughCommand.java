package com.yajava.bakecommand;

import com.yajava.cakes.Cake;
import com.yajava.cakes.MudCake;
import com.yajava.cakes.PrincessCake;
import com.yajava.cakes.Semla;

// For command class comments, see AddWhipCommand class

public class SoftDoughCommand implements BakeCommand {

    @Override
    public Cake process(Cake cake) {

        if (cake instanceof Semla) {
            System.out.println(cake.getClass().getSimpleName() + " need another dough procedure");
        }
        else if (cake instanceof MudCake) {
            ((MudCake) cake).setSugar("Sugar");
            ((MudCake) cake).setEgg("Egg");
            ((MudCake) cake).setFlour("Flour");
            ((MudCake) cake).setCocoa("Cocoa");
            ((MudCake) cake).setVanillaSugar("Vanilla sugar");
            ((MudCake) cake).setSalt("Salt");
            System.out.println("Mixed the " + ((MudCake) cake).getSugar().toLowerCase() + ", " + ((MudCake) cake).getEgg().toLowerCase()
                    + ", " + ((MudCake) cake).getFlour().toLowerCase() + ", " + ((MudCake) cake).getCocoa().toLowerCase()
                    + ", " + ((MudCake) cake).getVanillaSugar().toLowerCase() + " and " + ((MudCake) cake).getSalt().toLowerCase());
        }
        else if (cake instanceof PrincessCake) {
            System.out.println("Use ready-made cake base/sponge for " + cake.getClass().getSimpleName());
        }
        else {
            System.out.println("Cake type is not recognized");
        }
        return cake;
    }
}
