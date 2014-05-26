package com.soebes.patterns.state;

public class ConcreteState1 implements IState {

    private final Context context;

    public ConcreteState1(Context context) {
        System.out.println("ConcreteState1()");
        this.context = context;
    }

    @Override
    public void operate() {
        context.setCurrentState(new ConcreteState2(context));
    }

}
