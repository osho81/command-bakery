package com.yajava.bake;

import com.yajava.cakes.Cake;
import com.yajava.cakes.ChocolateCake;
import com.yajava.cakes.PrincessCake;
import com.yajava.cakes.Semla;

public class AddWhip implements BakeCommand {

    // Command method for this specific process-STEP
    @Override
    public Cake process(Cake cake) {

        // Manipulate chosen cake type fields/variables
        // Considering Cake can be 1 of 3 children; needs casting during runtime
        if (cake instanceof Semla) {
            System.out.println("Spread whip cream evenly and in a dome shape");
            ((Semla) cake).setWhipCream("Hard whip cream");
        }
        else if (cake instanceof ChocolateCake) {
            System.out.println("No whip cream needed for " + cake.getClass().getSimpleName());
        }
        else if (cake instanceof PrincessCake) {
            System.out.println("Added a click of whip cream");
            ((PrincessCake) cake).setWhipCream("Whip cream");
        }
        else {
            System.out.println("Cake type is not recognized");
        }
        return cake;
    }
}
