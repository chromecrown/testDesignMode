package com.designGOF.observer;

/**
 * ��������(ConcreteSubject)��ɫ.
 * ���й�״̬�������۲��߶����ھ���������ڲ�״̬�ı�ʱ�������еǼǹ��Ĺ۲��߷���֪ͨ�����������ɫ�ֽ������屻�۲���(Concrete
 * Observable)��ɫ
 * 
 * @author Administrator
 * 
 */
public class ConcreteSubject extends Subject
{
	private String state;

	public String getState()
	{
		return this.state;
	}

	public void change(String newState)
	{
		this.state = newState;
		System.out.println("����״̬Ϊ��"+state);
		//״̬�����ı䣬֪ͨ�����۲���
		this.notifyObserver(state);
	}
}
