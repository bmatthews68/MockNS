package com.btmatthews.mockns.easymock.test;

import org.springframework.beans.factory.annotation.Autowired;

public class Service {

	@Autowired
	private Dependency testDependency;
	
	public void doSomething() {
		this.testDependency.doSomething();
	}
}
