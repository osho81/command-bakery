package com.yajava.bakecommand;

import com.yajava.cakes.Cake;
import com.yajava.cakes.ChocolateCake;
import com.yajava.cakes.PrincessCake;
import com.yajava.cakes.Semla;

// For command class comments, see AddWhipCommand class

public class JamOnCakeBaseCommand implements BakeCommand {

    @Override
    public Cake process(Cake cake) {

        if (cake instanceof Semla) {
            System.out.println("No cake base or jam needed for " + cake.getClass().getSimpleName());
        } else if (cake instanceof ChocolateCake) {
            System.out.println("No cake base or jam needed for " + cake.getClass().getSimpleName());
        } else if (cake instanceof PrincessCake) {
            ((PrincessCake) cake).setRaspberryJam("Raspberry jam");
            ((PrincessCake) cake).setCakeBase("Cake base/sponge");
            System.out.println("Fetched " + ((PrincessCake) cake).getCakeBase().toLowerCase() + " & added a layer of "
                    + ((PrincessCake) cake).getRaspberryJam().toLowerCase() + " on it");
        } else {
            System.out.println("Cake type is not recognized");
        }
        return cake;
    }
}
