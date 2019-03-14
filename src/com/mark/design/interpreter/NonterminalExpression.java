package com.mark.design.interpreter;

/**
 * 非终结符表达式
 */
public class NonterminalExpression extends Expression {

	// 每个非终结符表达式都会对其他表达式产生依赖
	public NonterminalExpression(Expression... expressions) {
	}

	@Override
	public Object interpreter(String context) {
		// 进行文法处理
		return null;
	}
}
