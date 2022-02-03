package com.yajava.bake;

import com.yajava.cakes.Cake;
import com.yajava.cakes.ChocolateCake;
import com.yajava.cakes.PrincessCake;
import com.yajava.cakes.Semla;

// For command class comments, see primarily WhippingCream command class

public class VanillaOnBase implements BakeCommand {

    @Override
    public Cake process(Cake cake) {

        if (cake instanceof Semla) {
            System.out.println("No cake base or vanilla cream needed for " + cake.getClass().getSimpleName());
        }
        else if (cake instanceof ChocolateCake) {
            System.out.println("No cake base or vanilla cream for " + cake.getClass().getSimpleName());
        }
        else if (cake instanceof PrincessCake) {
            System.out.println("Added a level of cake base & added a layer of vanilla cream on it");
            ((PrincessCake) cake).setVanillaCream("Vanilla cream");
        }
        else {
            System.out.println("Cake type is not recognized");
        }
        return cake;
    }
}
