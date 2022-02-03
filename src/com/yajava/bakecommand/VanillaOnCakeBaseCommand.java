package com.yajava.bakecommand;

import com.yajava.cakes.Cake;
import com.yajava.cakes.ChocolateCake;
import com.yajava.cakes.PrincessCake;
import com.yajava.cakes.Semla;

// For command class comments, see primarily WhippingCream command class

public class VanillaOnCakeBaseCommand implements BakeCommand {

    @Override
    public Cake process(Cake cake) {

        if (cake instanceof Semla) {
            System.out.println("No cake base or vanilla cream needed for " + cake.getClass().getSimpleName());
        } else if (cake instanceof ChocolateCake) {
            System.out.println("No cake base or vanilla cream for " + cake.getClass().getSimpleName());
        } else if (cake instanceof PrincessCake) {
            ((PrincessCake) cake).setVanillaCream("Vanilla cream");
            System.out.println("Added another level of " + ((PrincessCake) cake).getCakeBase().toLowerCase() + " & added a layer of " +
                    ((PrincessCake) cake).getVanillaCream() + " on it");
        } else {
            System.out.println("Cake type is not recognized");
        }
        return cake;
    }
}
