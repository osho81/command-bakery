package com.yajava.bake;

import com.yajava.cakes.Cake;
import com.yajava.cakes.ChocolateCake;
import com.yajava.cakes.PrincessCake;
import com.yajava.cakes.Semla;

public class SemlaOvenPreparation implements BakeCommand {

    @Override
    public Cake process(Cake cake) {

        if (cake instanceof Semla) {
            System.out.println("Split semla dough into 12 lean rolls; placed on oven plate; let rest 90 minutes");
        }
        else if (cake instanceof ChocolateCake) {
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
