package com.mark.design.factory_method;

public class Client {

	public static void main(String[] args) {
		Creator creator = new ConcreteCreator();
		Product product = creator.createProduct(ConcreteProduct1.class);
		/**
		 * 继续业务处理
		 */
	}
}
