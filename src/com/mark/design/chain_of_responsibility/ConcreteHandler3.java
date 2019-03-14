package com.mark.design.chain_of_responsibility;

/**
 * 具体处理者角色
 */
public class ConcreteHandler3 extends Handler {

	// 设置自己的处理级别
	@Override
	protected Level getHandlerLevel() {
		// 设置自己的处理级别
		return null;
	}

	// 定义自己的处理逻辑
	@Override
	protected Response echo(Request request) {
		// 完成处理逻辑
		return null;
	}

}
