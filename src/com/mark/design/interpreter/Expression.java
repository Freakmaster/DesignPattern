package com.mark.design.interpreter;

/**
 * 抽象表达式
 */
public abstract class Expression {

	// 每个表达式必须有一个解析任务
	public abstract Object interpreter(String context);
}
