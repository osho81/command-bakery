package com.yajava.bakecommand;

import com.yajava.cakes.Cake;
import com.yajava.cakes.ChocolateCake;
import com.yajava.cakes.PrincessCake;
import com.yajava.cakes.Semla;

public class MeltButterCommand implements BakeCommand {

    @Override
    public Cake process(Cake cake) {

        if (cake instanceof Semla) {
            System.out.println("No melted butter needed for " + cake.getClass().getSimpleName());
        }
        else if (cake instanceof ChocolateCake) {
            System.out.println("Melted butter in a pot");
        }
        else if (cake instanceof PrincessCake) {
            System.out.println("No melted butter needed for " + cake.getClass().getSimpleName());
        }
        else {
            System.out.println("Cake type is not recognized");
        }
        return cake;
    }

}
