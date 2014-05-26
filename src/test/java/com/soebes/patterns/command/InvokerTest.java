package com.soebes.patterns.command;

import org.testng.annotations.Test;

public class InvokerTest {

    @Test
    public void firstTest() {
        Invoker invoker = new Invoker();

        invoker.addCommand(new CopyCommand());
        invoker.addCommand(new RenameCommand());
        invoker.addCommand(new MoveCommand());

        invoker.execute();
    }
}
