package com.soebes.patterns;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class FirstTest
{

    @Rule
    public ExpectedException x = ExpectedException.none();

    @Test
    public void firstTest() {
        x.expect( IllegalArgumentException.class );
        throw new IllegalArgumentException();
    }
}
