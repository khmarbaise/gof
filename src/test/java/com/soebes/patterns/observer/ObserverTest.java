package com.soebes.patterns.observer;

import org.junit.Test;

public class ObserverTest
{

    @Test
    public void should_do_something_meaningful()
    {
        Subject subject = new Subject();
        
        Observer observer = new Observer();
        
        subject.attach( observer );
        
    }
}
