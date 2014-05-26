package com.soebes.patterns.state3;

/**
 * Automaton class
 */
public class Automaton {
    // Initial state
    private State state = State.S;

    public void setState(State s) {
        this.state = s;
    }

    public void readZero() {
        // Delegate...
        state.readZero(this);
    }

    public void readOne() {
        // Delegate...
        state.readOne(this);
    }

    public boolean isInFinalState() {
        // Delegate...
        return state.isFinal();
    }

}