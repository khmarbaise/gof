package com.soebes.patterns.observer;

import static org.fest.assertions.Assertions.assertThat;
import static org.mockito.Mockito.mock;

import org.junit.Test;

public class SubjectTest
{
    @Test
    public void attach_should_return_itself()
    {
        Observer observer = mock( Observer.class );
        Subject subject = new Subject();
        assertThat( subject.attach( observer ) ).isSameAs( subject );
    }

    @Test
    public void add_observer_without_exception()
    {
        Observer observer = mock( Observer.class );
        Subject subject = new Subject();
        subject.attach( observer );
        //intentionally no assertThat()
    }

    @Test
    public void the_list_should_contain_the_same_observer_which_has_been_added()
    {
        Observer observer = mock( Observer.class );
        Subject subject = new Subject();
        subject.attach( observer );
        assertThat( subject.getObservers() ).hasSize( 1 ).containsExactly( observer );
    }

    @Test
    public void detach_should_return_itself()
        throws Exception
    {
        Observer observer = mock( Observer.class );
        Subject subject = new Subject();
        assertThat( subject.detach( observer ) ).isSameAs( subject );
    }

    @Test
    public void detach_should_remove_the_given_observer_from_the_list_of_observers()
    {
        Observer observer = mock( Observer.class );
        Subject subject = new Subject();
        subject.attach( observer );
        subject.detach( observer );
        assertThat( subject.getObservers() ).hasSize( 0 );
    }

    @Test
    public void should_call_notify_for_all_XXX()
        throws Exception
    {
        Observer observer = mock( Observer.class );
        Subject subject = new Subject();
        subject.attach( observer );
    }
}
