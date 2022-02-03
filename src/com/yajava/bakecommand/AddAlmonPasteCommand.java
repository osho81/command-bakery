package com.yajava.bakecommand;

import com.yajava.cakes.Cake;
import com.yajava.cakes.ChocolateCake;
import com.yajava.cakes.PrincessCake;
import com.yajava.cakes.Semla;

public class AddAlmonPasteCommand implements BakeCommand {

    @Override
    public Cake process(Cake cake) {

        if (cake instanceof Semla) {
            ((Semla) cake).setAlmondPaste("Almond paste");
            System.out.println("Split of bun top & dug out a bit; filled with " + ((Semla) cake).getAlmondPaste().toLowerCase());
        } else if (cake instanceof ChocolateCake) {
            System.out.println("No almond paste needed for " + cake.getClass().getSimpleName());
        } else if (cake instanceof PrincessCake) {
            System.out.println("No almond paste needed for " + cake.getClass().getSimpleName());
        } else {
            System.out.println("Cake type is not recognized");
        }
        return cake;
    }
}
