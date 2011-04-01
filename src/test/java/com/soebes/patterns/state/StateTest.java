package com.soebes.patterns.state;

import org.testng.annotations.Test;

public class StateTest {

    @Test
    public void firstState() {
        Context context = new Context();
        Client client = new Client(context);
        client.changeState();
    }
}
