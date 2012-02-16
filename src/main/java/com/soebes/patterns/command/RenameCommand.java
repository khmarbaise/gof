package com.soebes.patterns.command;

import org.apache.log4j.Logger;

public class RenameCommand implements ICommand {
	private static Logger LOGGER = Logger.getLogger(RenameCommand.class);

	@Override
	public void execute() {
		LOGGER.info("execute()");
	}

}
