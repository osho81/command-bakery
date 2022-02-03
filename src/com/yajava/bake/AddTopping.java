package com.yajava.bake;

import com.yajava.cakes.Cake;
import com.yajava.cakes.ChocolateCake;
import com.yajava.cakes.PrincessCake;
import com.yajava.cakes.Semla;

public class AddTopping implements BakeCommand {

    @Override
    public Cake process(Cake cake) {

        if (cake instanceof Semla) {
            System.out.println("Returned the top and added icing sugar on the top");
            ((Semla) cake).setIcingSugar("Icing sugar");
        }
        else if (cake instanceof ChocolateCake) {
            System.out.println("No topping needed for " + cake.getClass().getSimpleName());
        }
        else if (cake instanceof PrincessCake) {
            System.out.println("Covered with marzipan lid, added marzipan rose & icing sugar on the top");
            ((PrincessCake) cake).setMarzipanLid("Marzipan lid");
            ((PrincessCake) cake).setMarzipanRose("Marzipan rose");
            ((PrincessCake) cake).setIcingSugar("Icing sugar");
        }
        else {
            System.out.println("Cake type is not recognized");
        }
        return cake;
    }
}
