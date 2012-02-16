package com.soebes.patterns.command;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.testng.annotations.Test;

public class InvokerTest {
 
	@Test
	public void firstTest() {
		Invoker invoker = new Invoker();

		List<ICommand> commands = new ArrayList<ICommand>(Arrays.asList(new CopyCommand(), new RenameCommand(), new RenameCommand()));
		invoker.getCommands().addAll(commands);

		invoker.execute();
	}
}
