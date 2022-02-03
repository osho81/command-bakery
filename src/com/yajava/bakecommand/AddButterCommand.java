package com.yajava.bakecommand;

import com.yajava.cakes.Cake;
import com.yajava.cakes.ChocolateCake;
import com.yajava.cakes.PrincessCake;
import com.yajava.cakes.Semla;

public class AddButterCommand implements BakeCommand {

    // Command method for this specific process-STEP
    @Override
    public Cake process(Cake cake) {

        // Manipulate chosen cake type fields/variables
        // Considering Cake can be 1 of 3 children; needs casting during runtime
        if (cake instanceof Semla) {
            System.out.println( cake.getClass().getSimpleName() + " need another butter adding procedure");
        }
        else if (cake instanceof ChocolateCake) {
            ((ChocolateCake) cake).setButter("Butter");
            System.out.println("Added melted " + ((ChocolateCake) cake).getButter().toLowerCase() + " butter to the chocolate cake dough");
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
