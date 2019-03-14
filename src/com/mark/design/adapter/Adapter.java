package com.mark.design.adapter;

/**
 * 适配器
 */
public class Adapter extends Adaptee implements Target {

	@Override
	public void request() {
		super.doSomething();
	}
}
