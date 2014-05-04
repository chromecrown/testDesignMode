package com.designGOF.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * ��������(Subject)��ɫ.
 * ���������ɫ�����жԹ۲��߶�������ñ�����һ���ۼ�������ArrayList�����ÿ�����ⶼ�������κ������Ĺ۲��ߡ����������ṩһ���ӿ�
 * ���������Ӻ�ɾ���۲��߶��󣬳��������ɫ�ֽ������󱻹۲���(Observable)��ɫ
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
