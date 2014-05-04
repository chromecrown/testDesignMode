package com.designGOF.decorator;

public class ConcreteDecoratorB extends Decorator {
	public void Operation() {
		super.Operation();
		AddedBehavior();
		System.out.println("具体装饰对象B的操作");
	}
	private void AddedBehavior(){
		
	}
}
