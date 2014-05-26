package com.soebes.patterns.command;

import java.util.ArrayList;
import java.util.List;

public class Invoker {

    private List<ICommand> commands;

    public Invoker() {
        commands = new ArrayList<ICommand>();
    }

    public void execute() {
        for (ICommand command : getCommands()) {
            command.execute();
        }
    }

    public void addCommand(ICommand command) {
        getCommands().add(command);
    }

    public List<ICommand> getCommands() {
        return commands;
    }

    public void setCommands(List<ICommand> commands) {
        this.commands = commands;
    }

}
