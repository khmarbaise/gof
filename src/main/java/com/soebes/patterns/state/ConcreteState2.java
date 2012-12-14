package com.soebes.patterns.state;

public class ConcreteState2 implements IState {

  private final Context context;

  public ConcreteState2(Context context) {
    System.out.println("ConcreteState2()");
    this.context = context;
  }

  @Override
  public void operate() {
    context.setCurrentState(new ConcreteState1(context));
  }

}
