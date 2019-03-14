package com.mark.design.state;

/**
 * 具体状态类
 */
public class ConcreteState1 extends State {

	@Override
	public void handle1() {
		// 本状态下必须处理的逻辑
	}

	@Override
	public void handle2() {
		// 设置当前状态为state2
		super.context.setCurrentState(Context.STATE2);
		// 过渡到state2 状态，由Context 实现
		super.context.handle2();
	}
}
