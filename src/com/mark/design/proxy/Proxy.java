package com.mark.design.proxy;

/**
 * 代理类
 */
public class Proxy implements Subject {

	// 要代理哪个实现类
	private Subject subject = null;

	public Proxy() {
		// 有人觉得 RealSubject对象的创建应该是在main中实现；我认为RealSubject应该
		// 对用户是透明的，用户所面对的接口都是通过代理的；这样才是真正的代理；
		this.subject = new RealSubject();
	}

	// 预处理
	private void before() {
		// do something
	}

	// 善后处理
	private void after() {
		// do something
	}

	@Override
	public void request() {
		this.before();
		subject.request();
		this.after();
	}
}
