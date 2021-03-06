package com.yajava.bakecommand;

import com.yajava.cakes.Cake;
import com.yajava.cakes.MudCake;
import com.yajava.cakes.PrincessCake;
import com.yajava.cakes.Semla;

// For command class comments, see AddWhipCommand class

public class WhippingCreamCommand implements BakeCommand {

    @Override
    public Cake process(Cake cake) {
        if (cake instanceof Semla) {
            System.out.println("Hard-whipped the whip cream");
        }
        else if (cake instanceof MudCake) {
            System.out.println("No whip cream needed for " + cake.getClass().getSimpleName());
        }
        else if (cake instanceof PrincessCake) {
            System.out.println("Whipped the whip cream");
        }
        else {
            System.out.println("Cake type is not recognized");
        }
        return cake;
    }
}
