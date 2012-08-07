package com.soebes.patterns.visitor.element;

import com.soebes.patterns.visitor.visitor.Visitor;

public interface Element {

  void nimmEntgegen(Visitor visitor);

}