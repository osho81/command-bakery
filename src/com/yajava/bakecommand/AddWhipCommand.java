package com.yajava.bakecommand;

import com.yajava.cakes.Cake;
import com.yajava.cakes.MudCake;
import com.yajava.cakes.PrincessCake;
import com.yajava.cakes.Semla;

// All command classes (encapsulating a process-step) implements BakeCommand Interface

public class AddWhipCommand implements BakeCommand {

    // Command method for this specific process-STEP
    @Override
    public Cake process(Cake cake) { // (undefined) method from the BakeCommand Interface

        // Considering the cake can be 1 of 3 child classes (therefore casting)
        if (cake instanceof Semla) {
            // Manipulate object fields/variables with setters, and access for print out with getters
            ((Semla) cake).setWhipCream("Hard whip cream");
            System.out.println("Spread " + ((Semla) cake).getWhipCream().toLowerCase() + " evenly in a dome shape");
        }
        else if (cake instanceof MudCake) {
            System.out.println("Deviated from basic " + cake.getClass().getSimpleName().toLowerCase() + " recipe & added whip cream on mud cake");
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
