package com.soebes.patterns.state3;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

public class TransitionsTest {
  @Test
  public void f() {
    Automaton a = new Automaton();
    String s1 = "11010101";
    for (char c : s1.toCharArray()) {
      switch (c) {
      case '1':
        a.readOne();
        break;
      case '0':
        a.readZero();
        break;
      }
    }
    assertTrue(a.isInFinalState());
  }
}
