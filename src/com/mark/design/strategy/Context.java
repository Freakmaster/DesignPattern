package com.mark.design.strategy;

/**
 * 环境类
 */
public class Context {

	// 抽象策略
	private Strategy strategy;

	// 构造函数设置具体策略
	public Context(Strategy strategy) {
		this.strategy = strategy;
	}

	// 封装后的策略方式
	public void doAnything() {
		this.strategy.doSomething();
	}
}
