package com.soebes.patterns.command;

import org.apache.log4j.Logger;

public class MoveCommand implements ICommand {
  private static Logger LOGGER = Logger.getLogger(MoveCommand.class);

  @Override
  public void execute() {
    LOGGER.info("execute()");
  }

}
