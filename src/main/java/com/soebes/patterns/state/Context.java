package com.soebes.patterns.state;

public class Context {

    private IState currentState;

    public Context() {
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
