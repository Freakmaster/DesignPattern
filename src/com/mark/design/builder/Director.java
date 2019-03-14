package com.mark.design.builder;

/**
 * 指挥者
 */
public class Director {

	private Builder builder = new ConcreteBuilder();

	// 构建不同的产品
	public Product getAProduct() {
		builder.setPart();
		/*
		 * 设置不同的零件，产生不同的产品
		 */
		return builder.buildProduct();
	}
}
