package com.mark.design.abstract_factory;

public class Client {

	public static void main(String[] args) {
		AbstractCreator creator1 = new Creator1();
		AbstractProductA a1 = creator1.createProductA();
		AbstractProductB b1 = creator1.createProductB();

		AbstractCreator creator2 = new Creator2();
		AbstractProductA a2 = creator2.createProductA();
		AbstractProductB b2 = creator2.createProductB();
	}
}
