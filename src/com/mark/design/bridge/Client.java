package com.mark.design.bridge;

public class Client {

	public static void main(String[] args) {
		// 定义一个实现类对象
		Implementor imp = new ConcreteImplementor1();
		// 定义一个抽象类对象
		Abstraction abs = new RefinedAbstraction(imp);
		// 执行行文
		abs.request();
	}
}
