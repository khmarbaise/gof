package com.soebes.patterns.visitor.element;

import com.soebes.patterns.visitor.visitor.Visitor;

public class ConcreteElementB implements Element {

  public void nimmEntgegen(Visitor visitor) {
    System.out.println("ConcreteElementB::nimmEntgeben(Visitor visitor)");
    visitor.visitElement(this);
  }
}
