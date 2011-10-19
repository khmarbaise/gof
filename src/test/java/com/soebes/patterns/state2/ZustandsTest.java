package com.soebes.patterns.state2;

import org.testng.annotations.Test;

public class ZustandsTest {

    @Test
    public void ersteZustand() {
        Freundin f = new Freundin();
        f.getAktuellerZustand().verärgern();
        f.getAktuellerZustand().verärgern();
        f.getAktuellerZustand().unterhalten();
        f.getAktuellerZustand().kussGeben();
        f.getAktuellerZustand().unterhalten();
    }
}
