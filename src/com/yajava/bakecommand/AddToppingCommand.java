package com.yajava.bakecommand;

import com.yajava.cakes.Cake;
import com.yajava.cakes.ChocolateCake;
import com.yajava.cakes.PrincessCake;
import com.yajava.cakes.Semla;

// For command class comments, see AddWhipCommand class

public class AddToppingCommand implements BakeCommand {

    @Override
    public Cake process(Cake cake) {

        if (cake instanceof Semla) {
            ((Semla) cake).setIcingSugar("Icing sugar");
            System.out.println("Returned the top and added " + ((Semla) cake).getIcingSugar().toLowerCase() + " icing sugar on the top");
        } else if (cake instanceof ChocolateCake) {
            System.out.println("No topping needed for " + cake.getClass().getSimpleName());
        } else if (cake instanceof PrincessCake) {
            ((PrincessCake) cake).setMarzipanLid("Marzipan lid");
            ((PrincessCake) cake).setMarzipanRose("Marzipan rose");
            ((PrincessCake) cake).setIcingSugar("Icing sugar");
            System.out.println("Covered with " + ((PrincessCake) cake).getMarzipanLid().toLowerCase() + ", added "
                    + ((PrincessCake) cake).getMarzipanRose().toLowerCase() + " & " + ((PrincessCake) cake).getIcingSugar().toLowerCase() + " on the top");
        } else {
            System.out.println("Cake type is not recognized");
        }
        return cake;
    }
}
