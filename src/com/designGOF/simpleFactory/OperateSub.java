package com.designGOF.simpleFactory;

public class OperateSub extends Operation
{
	public double getResult()
	{
		double result = 0;
		result = getNumberA() - getNumberB();
		return result;
	}

}
