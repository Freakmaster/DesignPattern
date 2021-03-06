package com.mark.design.decorator;

public class Client {

	public static void main(String[] args) {
		Component component = new ConcreteComponent();
		// 第一次修饰
		component = new ConcreteDecorator1(component);
		// 第二次修饰
		component = new ConcreteDecorator2(component);
		// 修饰后
		component.operate();
	}
}
