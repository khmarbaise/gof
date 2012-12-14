package com.soebes.patterns.command;

import org.apache.log4j.Logger;

public class InsertCommand implements ICommand {
  private static Logger LOGGER = Logger.getLogger(InsertCommand.class);

  @Override
  public void execute() {
    LOGGER.info("execute()");
  }

}
