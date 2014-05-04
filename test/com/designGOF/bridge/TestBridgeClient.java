package com.designGOF.bridge;

import org.junit.Test;

import com.designGOF.composite.Composite;
import com.designGOF.composite.Leaf;

public class TestBridgeClient
{

	@Test
	public void test()
	{
		System.out.println("Bridge GOF start----");
		Abstraction ab = new RefinedAbstraction();
		ab.setImplementor(new ConcreteImplementorA());
		ab.Operation();
		
		ab.setImplementor(new ConcreteImplementorB());
		ab.Operation();
		System.out.println("Bridge GOF end----");
	}

}
