package com.yajava.bakery;

import com.yajava.bakecommand.BakeCommand;
import com.yajava.cakes.Cake;
import java.util.ArrayList;

// Class enabling adding and executing multiple commands

public class ProcessPipeline {

    // Takes the interface as data type, to capture all classes that implements it
    private ArrayList<BakeCommand> pipeline = new ArrayList<>();

    // Method for adding a command to the pipeline-list
    public void addCommand(BakeCommand command){
        pipeline.add(command);
    }

    // Method for executing each added command, with a for each loop
    public Cake execute(Cake cake) throws InterruptedException {
        Thread.sleep(1000); // Sleep is just a design choice
        for(var command : pipeline){
            cake = command.process(cake); // Execute current command
            Thread.sleep(500);
        }
        return cake;
    }

}
