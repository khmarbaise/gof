package com.soebes.patterns.visitor.visitor;

import com.soebes.patterns.visitor.element.ConcreteElementA;
import com.soebes.patterns.visitor.element.ConcreteElementB;

public class ConcreteVisitorA implements Visitor {

	@Override
	public void visitElement(ConcreteElementA a) {
		System.out.println("ConcreteVisitorA::visitElement(ConcreteElementA a)");
	}

	@Override
	public void visitElement(ConcreteElementB b) {
		System.out.println("ConcreteVisitorA::visitElement(ConcreteElementB a)");
	}

}
