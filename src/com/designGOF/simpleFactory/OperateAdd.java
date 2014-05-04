package com.designGOF.simpleFactory;

public class OperateAdd extends Operation
{
	public double getResult(){
		double result = getNumberA() + getNumberB();
		return result;
	}
}
