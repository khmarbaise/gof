package com.soebes.patterns.state;

public class Context {

  private IState currentState;

  public Context() {
    // This is the first state.
    this.currentState = new ConcreteState2(this);
  }

  public IState getCurrentState() {
    return currentState;
  }

  public void setCurrentState(IState currentState) {
    this.currentState = currentState;
  }

  public void operate() {
    currentState.operate();
  }
}
