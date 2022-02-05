package com.yajava.bakecommand;

import com.yajava.cakes.Cake;
import com.yajava.cakes.MudCake;
import com.yajava.cakes.PrincessCake;
import com.yajava.cakes.Semla;

// For command class comments, see AddWhipCommand class

public class BunDoughPrepCommand implements BakeCommand {

    @Override
    public Cake process(Cake cake) {

        if (cake instanceof Semla) {
            ((Semla) cake).setMilk("Milk");
            ((Semla) cake).setYeast("Yeast");
            ((Semla) cake).setFlour("Flour");
            System.out.println("Heated " + ((Semla) cake).getMilk().toLowerCase() + " & crumbed " + ((Semla) cake).getYeast().toLowerCase()
                    + "; mixed them & added 4 dl " + ((Semla) cake).getFlour().toLowerCase() + "; mixed & let rest 15 minutes");
        }
        else if (cake instanceof MudCake) {
            System.out.println(cake.getClass().getSimpleName() + " need another dough procedure");
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
