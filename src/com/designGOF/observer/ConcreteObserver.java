package com.designGOF.observer;

/**
 * ����۲���(ConcreteObserver)��ɫ
 * �洢�������״̬��ǡ��״̬������۲��߽�ɫʵ�ֳ���۲��߽�ɫ��Ҫ��ĸ��½ӿڣ�
 * �Ա�ʹ�����״̬�������״̬��Э����
 * �����Ҫ������۲��߽�ɫ���Ա���һ��ָ����������������á�
 * 
 * @author Administrator
 * 
 */
public class ConcreteObserver implements IObserver
{
	private String observerStat;

	public void update(String newState)
	{
		//���¹۲��ߵ�״̬��ʹ����Ŀ���״̬����һ��
		observerStat = newState;
		System.out.println("now class ConcreteObserver state is "
				+ observerStat);
	}

}
