package com.designGOF.simpleFactory;

/**
 * ��������
 * 
 * @author sulp
 * 
 */
public class OperateDiv extends Operation
{
	public double getResult()
	{
		double result = 0;
		if (getNumberB() == 0)
		{
			try
			{
				throw new Exception("��������Ϊ0");
			} catch (Exception e)
			{
				e.printStackTrace();
			}
		}
		result = getNumberA() / getNumberB();
		return getResult();
	}
}
