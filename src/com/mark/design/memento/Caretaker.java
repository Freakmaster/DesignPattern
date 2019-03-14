package com.mark.design.memento;

/**
 * 备忘录管理员角色
 */
public class Caretaker {

	// 备忘录角色
	private Memento memento;

	public Memento getMemento() {
		return memento;
	}

	public void setMemento(Memento memento) {
		this.memento = memento;
	}
}
