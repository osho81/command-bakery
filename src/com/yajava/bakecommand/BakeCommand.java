package com.yajava.bakecommand;

import com.yajava.cakes.Cake;

// Interface command, implemented by all command classes

public interface BakeCommand {

    // Undefined method to be defined in implementing classes
    Cake process(Cake cake); // do(), execute() or other name works too

    // Could also have unprocess(), undo(), unexecute() etc
    // But unrealistic to undo baked ingredients

}
