package com.yajava.bakecommand;

import com.yajava.cakes.Cake;
import com.yajava.cakes.MudCake;
import com.yajava.cakes.PrincessCake;
import com.yajava.cakes.Semla;

// For command class comments, see AddWhipCommand class

public class OvenTimeCommand implements BakeCommand {

    @Override
    public Cake process(Cake cake) {

        if (cake instanceof Semla) {
            System.out.println("Baked the cake for " + ((Semla) cake).getOvenMinutes() + " minutes at " + ((Semla) cake).getOvenTemperature() + " degrees");
        } else if (cake instanceof MudCake) {
            System.out.println("Baked the cake for " + ((MudCake) cake).getOvenMinutes() + " minutes at " + ((MudCake) cake).getOvenTemperature() + " degrees");
        } else if (cake instanceof PrincessCake) {
            System.out.println("No oven procedure for " + cake.getClass().getSimpleName());
        } else {
            System.out.println("Cake type is not recognized");
        }
        return cake;
    }
}
