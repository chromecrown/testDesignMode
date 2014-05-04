package com.designGOF.observer;

/**
 * 为所有的具体观察者定义一个接口， 在得到主题的通知时更新自己，这个接口叫做更新接口
 * 
 * @author Administrator
 * 
 */
public interface IObserver
{
	public void update(String newState);
}
