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
		System.out.println("观察者模式 start----");
		//创建主题对象
		ConcreteSubject subject = new ConcreteSubject();
		
		//创建观察者对象
		IObserver observer = new ConcreteObserver();
		//将观察者对象登记到主题对象上
		subject.attach(observer);
		
		//改变主题对象的状态
		subject.change("new State");
		System.out.println("观察者模式 end----");
	}

}
