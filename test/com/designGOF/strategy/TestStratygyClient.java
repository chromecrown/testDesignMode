package com.designGOF.strategy;

import org.junit.Test;

public class TestStratygyClient
{

	@Test
	public void test()
	{
		System.out.println("����ģʽ start----");
		Context context;
		context = new Context(new ConcreteStrategyA());
		context.ContextInterface();
		
		context = new Context(new ConcreteStrategyB());
		context.ContextInterface();
		
		context = new Context(new ConcreteStrategyC());
		context.ContextInterface();
		
		System.out.println("����ģʽ end----");
	}

}
