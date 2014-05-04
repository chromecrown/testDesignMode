package com.designGOF.observer;

import org.junit.Test;

import com.designGOF.observer.ConcreteObserver;
import com.designGOF.observer.ConcreteSubject;
import com.designGOF.observer.IObserver;

public class TestObserverClient
{

	@Test
	public void test()
	{
		System.out.println("�۲���ģʽ start----");
		//�����������
		ConcreteSubject subject = new ConcreteSubject();
		
		//�����۲��߶���
		IObserver observer = new ConcreteObserver();
		//���۲��߶���Ǽǵ����������
		subject.attach(observer);
		
		//�ı���������״̬
		subject.change("new State");
		System.out.println("�۲���ģʽ end----");
	}

}
