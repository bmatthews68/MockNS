package com.btmatthews.mockns.easymock.test;

import org.easymock.classextension.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration
public class TestMockNamespace {
	@Autowired
	private Service service;

	@Autowired
	private Dependency dependency;
	
	@Test
	public void test() {
		this.dependency.doSomething();
		EasyMock.expectLastCall();
		EasyMock.replay(this.dependency);
		this.service.doSomething();
		EasyMock.verify(this.dependency);
	}
}
