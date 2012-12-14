package com.soebes.patterns.visitor.visitor;

import com.soebes.patterns.visitor.element.ConcreteElementA;
import com.soebes.patterns.visitor.element.ConcreteElementB;

public interface Visitor {

  void visitElement(ConcreteElementA a);

  void visitElement(ConcreteElementB b);
}
