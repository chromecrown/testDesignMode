package com.designGOF.decorator;

public class ConcreteDecoratorB extends Decorator {
	public void Operation() {
		super.Operation();
		AddedBehavior();
		System.out.println("����װ�ζ���B�Ĳ���");
	}
	private void AddedBehavior(){
		
	}
}
