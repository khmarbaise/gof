package com.soebes.patterns.observer;

import static org.fest.assertions.Assertions.assertThat;
import static org.mockito.Mockito.mock;

import org.junit.Test;

public class SubjectTest
{
    @Test
    public void should_return_itself()
    {
        Observer observer = mock( Observer.class );
        Subject subject = new Subject();
        assertThat( subject.attach( observer ) ).isSameAs( subject );
    }

    @Test
    public void should_add_observer_without_exception()
    {
        Observer observer = mock( Observer.class );
        Subject subject = new Subject();
        subject.attach( observer );
        //intentionally no assertThat()
    }

    @Test
    public void should_return_the_same_observer_which_has_been_added()
    {
        Observer observer = mock( Observer.class );
        Subject subject = new Subject();
        subject.attach( observer );
        assertThat( subject.getObservers() ).hasSize( 1 ).containsExactly( observer );
    }
}
