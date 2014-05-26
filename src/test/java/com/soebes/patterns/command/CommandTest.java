package com.soebes.patterns.command;

import org.testng.annotations.Test;

public class CommandTest {

    @Test
    public void firstTest() {
        ICommand command = new CopyCommand();
        command.execute();
    }
}
