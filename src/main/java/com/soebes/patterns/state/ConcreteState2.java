package com.soebes.patterns.state;

public class ConcreteState2 implements IState {

    private final Context context;

    public ConcreteState2(Context context) {
        this.context = context;
    }

    @Override
    public void operate() {
        System.out.println("ConcreteState2()");
        context.setCurrentState(new ConcreteState1(context));
    }

}
