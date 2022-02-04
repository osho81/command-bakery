package com.yajava.bakecommand;

import com.yajava.cakes.Cake;
import com.yajava.cakes.ChocolateCake;
import com.yajava.cakes.PrincessCake;
import com.yajava.cakes.Semla;

// For command class comments, see AddWhipCommand class

public class BunDoughFinalizeCommand implements BakeCommand {

    @Override
    public Cake process(Cake cake) {

        if (cake instanceof Semla) {
            ((Semla) cake).setYeast("Yeast");
            ((Semla) cake).setEgg("Egg");
            ((Semla) cake).setSalt("Salt");
            ((Semla) cake).setCardamom("Cardamom");
            ((Semla) cake).setSugar("Sugar");
            ((Semla) cake).setButter("Butter");
            System.out.println("Added 3 dl " + ((Semla) cake).getFlour().toLowerCase() + ", " + ((Semla) cake).getEgg().toLowerCase() + ", "
                    + ((Semla) cake).getSalt().toLowerCase() + ", " + ((Semla) cake).getCardamom().toLowerCase() + ", "  + ((Semla) cake).getSugar().toLowerCase()
                    + "; worked in the " + ((Semla) cake).getButter().toLowerCase() + "; let rest 30 minutes");
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
