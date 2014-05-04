package com.designGOF.simpleFactory;

/**
 * �����㹤����
 * 
 * @author sulp
 * 
 */
public class OperationFactory
{
	public static Operation createOperate(char operate)
	{
		Operation operation = null;
		switch (operate)
		{
			case ('+'):
				operation = new OperateAdd();
				break;
			case ('-'):
				operation = new OperateSub();
				break;
			case ('*'):
				operation = new OperateMul();
				break;
			case ('/'):
				operation = new OperateDiv();
				break;
		}
		return operation;
	}
}
