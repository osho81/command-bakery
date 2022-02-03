package com.yajava.bake;

import com.yajava.cakes.Cake;
import com.yajava.cakes.ChocolateCake;
import com.yajava.cakes.PrincessCake;
import com.yajava.cakes.Semla;

public class SemlaDoughPreparation implements BakeCommand {

    @Override
    public Cake process(Cake cake) {

        if (cake instanceof Semla) {
            System.out.println("Heated milk & crumbed yeast; mixed them & added 4 dl flour; mixed & let rest 15 minutes");
            ((Semla) cake).setMilk("Milk");
            ((Semla) cake).setYeast("Yeast");
            ((Semla) cake).setFlour("Flour");
        }
        else if (cake instanceof ChocolateCake) {
            System.out.println(cake.getClass().getSimpleName() + " need another dough procedure");
        }
        else if (cake instanceof PrincessCake) {
            System.out.println("Use ready-made cake base/sponge for " + cake.getClass().getSimpleName());
        }
        else {
            System.out.println("Cake type is not recognized");
        }
        return cake;
    }
}
