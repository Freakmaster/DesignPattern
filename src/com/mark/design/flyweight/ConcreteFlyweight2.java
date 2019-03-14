package com.mark.design.flyweight;

/**
 * 具体享元类
 */
public class ConcreteFlyweight2 extends Flyweight {

	// 接受外部状态
	public ConcreteFlyweight2(String Extrinsic) {
		super(Extrinsic);
	}

	// 根据外部状态进行逻辑处理
	@Override
	public void operate() {
		// 业务逻辑
	}
}
