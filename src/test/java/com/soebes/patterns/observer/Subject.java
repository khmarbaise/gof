package com.soebes.patterns.observer;

import java.util.ArrayList;
import java.util.List;

public class Subject
{
    private List<Observer> observers;

    public Subject()
    {
        observers = new ArrayList<Observer>();
    }

    public Subject attach( Observer observer )
    {
        observers.add( observer );
        return this;
    }

    public List<Observer> getObservers() {
        return observers;
    }

    public Subject detach( Observer observer )
    {
        observers.remove( observer );
        return this;
    }
}
