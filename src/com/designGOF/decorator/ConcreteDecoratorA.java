package com.designGOF.decorator;

public class ConcreteDecoratorA extends Decorator {
	private String addedState;

	public void Operation() {
		super.Operation();
		addedState = "New State";
		System.out.println("����װ�ζ���A�Ĳ���"+addedState);
	}
}
