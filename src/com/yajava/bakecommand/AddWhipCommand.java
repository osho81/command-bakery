package com.yajava.bakecommand;

import com.yajava.cakes.Cake;
import com.yajava.cakes.ChocolateCake;
import com.yajava.cakes.PrincessCake;
import com.yajava.cakes.Semla;

public class AddWhipCommand implements BakeCommand {

    // Command method for this specific process-STEP
    @Override
    public Cake process(Cake cake) {

        // Manipulate chosen cake type fields/variables
        // Considering Cake can be 1 of 3 children; needs casting during runtime
        if (cake instanceof Semla) {
            ((Semla) cake).setWhipCream("Hard whip cream");
            System.out.println("Spread " + ((Semla) cake).getWhipCream().toLowerCase() + " evenly in a dome shape");
        }
        else if (cake instanceof ChocolateCake) {
            System.out.println("Deviated from basic " + cake.getClass().getSimpleName().toLowerCase() + " recipe & added whip cream on chocolate cake");
        }
        else if (cake instanceof PrincessCake) {
            ((PrincessCake) cake).setWhipCream("Whip cream");
            System.out.println("Added a click of " + ((PrincessCake) cake).getWhipCream().toLowerCase());
        }
        else {
            System.out.println("Cake type is not recognized");
        }
        return cake;
    }
}
