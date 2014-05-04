package com.designGOF.simpleFactory;

/**
 * 除法运算
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
				throw new Exception("除数不能为0");
			} catch (Exception e)
			{
				e.printStackTrace();
			}
		}
		result = getNumberA() / getNumberB();
		return getResult();
	}
}
