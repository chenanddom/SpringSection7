package com.flexible.autoprxycreator.defaultautoproxycreator;


public class Waiter implements BeanSelfProxyAware {
	private Waiter waiter;

	public void setSelfProxy(Object object) {
		waiter = (Waiter)object;
	}

	public void serveTo(String name){
		System.out.println("waiter serving "+name+"...");
		//waiter.greetTo(name);
	}

	public void greetTo(String name) {
		System.out.println("waiter greet to "+name+"...");
	}
}
