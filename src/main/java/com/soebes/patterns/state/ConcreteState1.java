package com.soebes.patterns.state;

public class ConcreteState1 implements IState {

    private final Context context;

    public ConcreteState1(Context context) {
        this.context = context;
    }

    @Override
    public void operate() {
        System.out.println("ConcreteState1()");
        context.setCurrentState(new ConcreteState2(context));
    }

}
