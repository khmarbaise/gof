package com.soebes.patterns.visitor.element;

import com.soebes.patterns.visitor.visitor.Visitor;

public class ConcreteElementA implements Element {

  /*
   * (non-Javadoc)
   * 
   * @see com.soebes.patterns.visitor.Element#nimmEntgegen(com.soebes.patterns.
   * visitor.Visitor)
   */
  public void nimmEntgegen(Visitor visitor) {
    System.out.println("ConcreteElementA::nimmEntgeben(Visitor visitor)");
    visitor.visitElement(this);
  }

}
