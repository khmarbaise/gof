package com.soebes.patterns.command;

import org.apache.log4j.Logger;

public class CopyCommand implements ICommand {
    private static Logger LOGGER = Logger.getLogger(CopyCommand.class);

    @Override
    public void execute() {
        LOGGER.info("execute()");
    }

}
