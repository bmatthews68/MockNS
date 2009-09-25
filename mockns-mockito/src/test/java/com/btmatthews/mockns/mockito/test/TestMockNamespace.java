package com.btmatthews.mockns.mockito.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
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
		this.service.doSomething();
		Mockito.verify(this.dependency, Mockito.times(1)).doSomething();
	}
}
