package com.designGOF.simpleFactory;

public class OperateMul extends Operation
{
	public double getResult()
	{
		double result = getNumberA() * getNumberB();
		return result;
	}
}
