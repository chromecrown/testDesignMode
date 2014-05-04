package com.designGOF.decorator;

import org.junit.Test;

import com.designGOF.composite.Composite;
import com.designGOF.composite.Leaf;

public class TestDecoratorClient
{

	@Test
	public void test()
	{
		System.out.println("Decorator GOF start----");
		ConcreteComponent c = new ConcreteComponent();
		ConcreteDecoratorA d1 = new ConcreteDecoratorA();
		ConcreteDecoratorB d2 = new ConcreteDecoratorB();
		
		d1.setComponent(c);
		d2.setComponent(d1);
		d2.Operation();
		System.out.println("Decorator GOF end----");
	}

}
