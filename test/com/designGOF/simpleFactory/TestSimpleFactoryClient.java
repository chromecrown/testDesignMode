package com.designGOF.simpleFactory;

import org.junit.Test;

import com.designGOF.simpleFactory.Operation;
import com.designGOF.simpleFactory.OperationFactory;

public class TestSimpleFactoryClient
{

	@Test
	public void test()
	{
		System.out.println("�򵥹���ģʽ start----");
		Operation oper;
		oper = OperationFactory.createOperate('+');
		oper.setNumberA(1);
		oper.setNumberB(4);
		double result = oper.getResult();
		System.out.println(result);
		System.out.println("�򵥹���ģʽ end----");
	}

}
