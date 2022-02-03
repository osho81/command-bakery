package com.yajava.bake;

import com.yajava.cakes.Cake;

public interface BakeCommand {

    // Undefined method to be defined in implementing classes
    Cake process(Cake cake); // do(), execute() or other name works too

    // Could also have undo-method (but we can't undo baked ingredients)
    // unprocess(), undo(), unexecute() etc

}
