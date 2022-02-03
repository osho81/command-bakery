package com.yajava.bake;

import com.yajava.cakes.Cake;
import com.yajava.cakes.ChocolateCake;
import com.yajava.cakes.PrincessCake;
import com.yajava.cakes.Semla;

public class OvenTime implements BakeCommand {

    @Override
    public Cake process(Cake cake) {

        if (cake instanceof Semla) {
            System.out.println("Baked the cake for " + ((Semla) cake).getOvenMinutes() + " at " + ((Semla) cake).getOvenTemperature() + " degrees");
        } else if (cake instanceof ChocolateCake) {
            System.out.println("Baked the cake for " + ((ChocolateCake) cake).getOvenMinutes() + " at " + ((ChocolateCake) cake).getOvenTemperature() + " degrees");
        } else if (cake instanceof PrincessCake) {
            System.out.println("No oven procedure for " + cake.getClass().getSimpleName());
        } else {
            System.out.println("Cake type is not recognized");
        }
        return cake;
    }
}
