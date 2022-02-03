package com.yajava.bakecommand;

import com.yajava.cakes.Cake;
import com.yajava.cakes.ChocolateCake;
import com.yajava.cakes.PrincessCake;
import com.yajava.cakes.Semla;

public class SoftDoughCommand implements BakeCommand {

    @Override
    public Cake process(Cake cake) {

        if (cake instanceof Semla) {
            System.out.println(cake.getClass().getSimpleName() + " need another dough procedure");
        }
        else if (cake instanceof ChocolateCake) {
            ((ChocolateCake) cake).setSugar("Sugar");
            ((ChocolateCake) cake).setEgg("Egg");
            ((ChocolateCake) cake).setFlour("Flour");
            ((ChocolateCake) cake).setCocoa("Cocoa");
            ((ChocolateCake) cake).setVanillaSugar("Vanilla sugar");
            ((ChocolateCake) cake).setSalt("Salt");
            System.out.println("Mixed the " + ((ChocolateCake) cake).getSugar().toLowerCase() + ", " + ((ChocolateCake) cake).getEgg().toLowerCase()
                    + ", " + ((ChocolateCake) cake).getFlour().toLowerCase() + ", " + ((ChocolateCake) cake).getCocoa().toLowerCase()
                    + ", " + ((ChocolateCake) cake).getVanillaSugar().toLowerCase() + " and " + ((ChocolateCake) cake).getSalt().toLowerCase());
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
