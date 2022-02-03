package com.yajava.bake;

import com.yajava.cakes.Cake;
import com.yajava.cakes.ChocolateCake;
import com.yajava.cakes.PrincessCake;
import com.yajava.cakes.Semla;

public class ChocolateCakeDough implements BakeCommand {

    @Override
    public Cake process(Cake cake) {

        if (cake instanceof Semla) {
            System.out.println(cake.getClass().getSimpleName() + " need another dough procedure");
        }
        else if (cake instanceof ChocolateCake) {
            System.out.println("Mixed the sugar, eggs, flour, cocoa, vanilla sugar and salt");
            ((ChocolateCake) cake).setSugar("Sugar");
            ((ChocolateCake) cake).setEgg("Eggs");
            ((ChocolateCake) cake).setFlour("Flour");
            ((ChocolateCake) cake).setCocoa("Cocoa");
            ((ChocolateCake) cake).setVanillaSugar("Vanilla sugar");
            ((ChocolateCake) cake).setSalt("Salt");
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
