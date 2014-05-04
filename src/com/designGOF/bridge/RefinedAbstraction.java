package com.designGOF.bridge;

public class RefinedAbstraction extends Abstraction{

	public void Operation(){
		implementor.Operation();
	}
}
