package com.yajava.bakecommand;

import com.yajava.cakes.Cake;
import com.yajava.cakes.MudCake;
import com.yajava.cakes.PrincessCake;
import com.yajava.cakes.Semla;

// For command class comments, see AddWhipCommand class

public class BunOvenPrepCommand implements BakeCommand {

    @Override
    public Cake process(Cake cake) {

        if (cake instanceof Semla) {
            System.out.println("Split semla dough into 12 lean rolls; placed on oven plate; let rest 90 minutes");
        }
        else if (cake instanceof MudCake) {
            System.out.println(cake.getClass().getSimpleName() + " need another oven preparation");
        }
        else if (cake instanceof PrincessCake) {
            System.out.println("No oven procedure for " + cake.getClass().getSimpleName());
        }
        else {
            System.out.println("Cake type is not recognized");
        }
        return cake;
    }
}
