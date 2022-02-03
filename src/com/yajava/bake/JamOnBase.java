package com.yajava.bake;

import com.yajava.cakes.Cake;
import com.yajava.cakes.ChocolateCake;
import com.yajava.cakes.PrincessCake;
import com.yajava.cakes.Semla;

// For command class comments, see primarily WhippingCream command class

public class JamOnBase implements BakeCommand {

    @Override
    public Cake process(Cake cake) {

        if (cake instanceof Semla) {
            System.out.println("No cake base or jam needed for " + cake.getClass().getSimpleName());
        }
        else if (cake instanceof ChocolateCake) {
            System.out.println("No cake base or jam needed for " + cake.getClass().getSimpleName());
        }
        else if (cake instanceof PrincessCake) {
            System.out.println("Fetched cake base & added a layer of raspberry jam on it");
            ((PrincessCake) cake).setRaspberryJam("Raspberry jam");
            ((PrincessCake) cake).setCakeBase("Cake base/sponge");
        }
        else {
            System.out.println("Cake type is not recognized");
        }
        return cake;
    }
}
