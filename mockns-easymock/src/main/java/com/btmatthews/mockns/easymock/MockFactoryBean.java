/*
 * Copyright 2009-2011 Brian Matthews
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.btmatthews.mockns.easymock;

import org.easymock.EasyMock;
import org.springframework.beans.factory.FactoryBean;

/**
 * The factory bean that creates EasyMock mock objects.
 * 
 * @author <a href="mailto:brian@btmatthews.com">Brian Matthews</a>
 * @version 0.1.0
 */
public final class MockFactoryBean<T> implements FactoryBean<T> {
	/**
	 * The interface or class to be mocked.
	 */
	private Class<T> objectClass;

	/**
	 * The constructor.
	 * 
	 * @param clazz
	 *            The interface or class to be mocked.
	 */
	public MockFactoryBean(final Class<T> clazz) {
		this.objectClass = clazz;
	}

	/**
	 * Create the mock object.
	 * 
	 * @return The mock object.
	 */
	public T getObject() {
		return EasyMock.createMock(this.objectClass);
	}

	/**
	 * Return the interface or class that will be mocked.
	 * 
	 * @return The interface or class.
	 */
	public Class<?> getObjectType() {
		return this.objectClass;
	}

	/**
	 * Indicate that mock objects created by this factory are singletons.
	 * 
	 * @return Always returns <code>true</code>.
	 */
	public boolean isSingleton() {
		return true;
	}
}
