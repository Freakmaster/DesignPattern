package com.mark.design.decorator;

/**
 * 具体构件
 */
public class ConcreteComponent extends Component {

	// 具体实现
	@Override
	public void operate() {
		System.out.println("do Something");
	}
}
