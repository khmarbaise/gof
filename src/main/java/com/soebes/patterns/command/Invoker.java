package com.soebes.patterns.command;

import java.util.ArrayList;

public class Invoker {

	private ArrayList<ICommand> commands;

	public Invoker() {
		commands = new ArrayList<ICommand>();
	}

	public void execute() {
		for (ICommand	command : getCommands()) {
			command.execute();
		}
	}

	public void addCommand (ICommand command) {
		getCommands().add(command);
	}

	public ArrayList<ICommand> getCommands() {
		return commands;
	}

	public void setCommands(ArrayList<ICommand> commands) {
		this.commands = commands;
	}
	
}
