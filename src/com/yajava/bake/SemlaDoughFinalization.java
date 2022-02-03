package com.yajava.bake;

import com.yajava.cakes.Cake;
import com.yajava.cakes.ChocolateCake;
import com.yajava.cakes.PrincessCake;
import com.yajava.cakes.Semla;

public class SemlaDoughFinalization implements BakeCommand {

    @Override
    public Cake process(Cake cake) {

        if (cake instanceof Semla) {
            System.out.println("Added 3 dl flour, eggs, salt, cardamom, sugar; worked in the butter; let rest 30 minutes");
            ((Semla) cake).setYeast("Yeast");
            ((Semla) cake).setEgg("Egg");
            ((Semla) cake).setSalt("Salt");
            ((Semla) cake).setCardamom("Cardamom");
            ((Semla) cake).setSugar("Sugar");
            ((Semla) cake).setButter("Butter");
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
