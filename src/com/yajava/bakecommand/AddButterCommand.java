package com.yajava.bakecommand;

import com.yajava.cakes.Cake;
import com.yajava.cakes.MudCake;
import com.yajava.cakes.PrincessCake;
import com.yajava.cakes.Semla;

// For command class comments, see AddWhipCommand class

public class AddButterCommand implements BakeCommand {

    @Override
    public Cake process(Cake cake) {

        if (cake instanceof Semla) {
            System.out.println( cake.getClass().getSimpleName() + " need another butter adding procedure");
        }
        else if (cake instanceof MudCake) {
            ((MudCake) cake).setButter("Butter");
            System.out.println("Added melted " + ((MudCake) cake).getButter().toLowerCase() + " butter to the mud cake dough");
        }
        else if (cake instanceof PrincessCake) {
            System.out.println("No butter needed for " + cake.getClass().getSimpleName());
        }
        else {
            System.out.println("Cake type is not recognized");
        }
        return cake;
    }
}
