package com.mark.design.command;

public class ConcreteCommand2 extends Command {

	// 持有相应的接收者对象
	private Receiver receiver;

	// 构造函数传递接收者
	public ConcreteCommand2(Receiver receiver) {
		this.receiver = receiver;
	}

	// 必须实现一个命令
	@Override
	public void execute() {
		// 业务处理
		this.receiver.doSomething();
	}
}
