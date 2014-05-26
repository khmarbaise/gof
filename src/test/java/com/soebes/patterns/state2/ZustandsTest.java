package com.soebes.patterns.state2;

import org.testng.annotations.Test;

public class ZustandsTest {

    @Test
    public void ersteZustand() {
        Freundin f = new Freundin();
        f.getZustand().verärgern();
        f.getZustand().verärgern();
        f.getZustand().unterhalten();
        f.getZustand().kussGeben();
        f.getZustand().unterhalten();
    }
}
