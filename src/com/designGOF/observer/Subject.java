package com.designGOF.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 抽象主题(Subject)角色.
 * 抽象主题角色把所有对观察者对象的引用保存在一个聚集（比如ArrayList对象）里，每个主题都可以有任何数量的观察者。抽象主题提供一个接口
 * ，可以增加和删除观察者对象，抽象主题角色又叫做抽象被观察者(Observable)角色
 * 
 * @author Administrator
 * 
 */
public abstract class Subject
{
	private List<IObserver> observers = new ArrayList<IObserver>();

	public void attach(IObserver observer)
	{
		observers.add(observer);
	}

	public void detach(IObserver observer)
	{
		observers.remove(observer);
	}

	protected void notifyObserver(String newState)
	{
		for(IObserver observer:observers){
			observer.update(newState);
		}
	}
}
