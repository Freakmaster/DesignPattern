package com.mark.design.state;

/**
 * 具体状态类
 */
public class ConcreteState2 extends State {

	@Override
	public void handle1() {
		// 设置当前状态为state1
		super.context.setCurrentState(Context.STATE1);
		// 过渡到state1 状态，由Context 实现
		super.context.handle1();
	}

	@Override
	public void handle2() {
		// 本状态下必须处理的逻辑
	}
}
