package com.designGOF.observer;

/**
 * 具体观察者(ConcreteObserver)角色
 * 存储与主题的状态自恰的状态。具体观察者角色实现抽象观察者角色所要求的更新接口，
 * 以便使本身的状态与主题的状态像协调。
 * 如果需要，具体观察者角色可以保持一个指向具体主题对象的引用。
 * 
 * @author Administrator
 * 
 */
public class ConcreteObserver implements IObserver
{
	private String observerStat;

	public void update(String newState)
	{
		//更新观察者的状态，使其与目标的状态保持一致
		observerStat = newState;
		System.out.println("now class ConcreteObserver state is "
				+ observerStat);
	}

}
