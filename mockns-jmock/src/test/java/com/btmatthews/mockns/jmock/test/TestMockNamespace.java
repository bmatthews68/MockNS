package com.btmatthews.mockns.jmock.test;

import org.jmock.Expectations;
import org.jmock.Mockery;
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

	@Autowired
	private Mockery mockery;

	@Test
	public void test() {
		this.mockery.checking(new Expectations() {
			{
				allowing(TestMockNamespace.this.dependency).doSomething();
			}
		});
		this.service.doSomething();
	}
}
