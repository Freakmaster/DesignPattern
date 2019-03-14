package com.mark.design.observer;

/**
 * 具体被观察者
 */
public class ConcreteSubject extends Subject {

	// 具体的业务
	public void doSomething() {
		/*
		 * do something
		 */
		super.notifyObservers();
	}
}
