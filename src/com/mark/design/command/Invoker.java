package com.mark.design.command;

/**
 * 调用者
 */
public class Invoker {

	/**
	 * 持有命令对象
	 */
	private Command command;

	// 接受命令
	public void setCommand(Command command) {
		this.command = command;
	}

	/**
	 * 行动命令
	 */
	public void action() {
		this.command.execute();
	}
}
