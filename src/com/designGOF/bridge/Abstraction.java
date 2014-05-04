package com.designGOF.bridge;

public class Abstraction {
	protected Implementor implementor;

	public void setImplementor(Implementor implementor) {
		this.implementor = implementor;
	}
	public void Operation(){
		implementor.Operation();
	}
}
