/*
 * Copyright (c) 2009 Brian Thomas Matthews
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

package com.btmatthews.mockns.mockito;

import org.mockito.Mockito;
import org.springframework.beans.factory.FactoryBean;

/**
 * The bean definition parser for the EasyMock mock objects.
 * 
 * @author <a href="mailto:brian@btmatthews.com">Brian Matthews</a>
 * @version $Rev$
 */
public class MockFactoryBean implements FactoryBean {

	@SuppressWarnings("unchecked")
	private Class objectClass;

	/**
	 * The default constructor.
	 */
	@SuppressWarnings("unchecked")
	public MockFactoryBean(final Class objectClass) {
		this.objectClass = objectClass;
	}

	/**
	 * @return
	 * @throws Exception
	 */
	@SuppressWarnings("unchecked")
	@Override
	public Object getObject() throws Exception {
		return Mockito.mock(this.objectClass);
	}

	/**
	 * @return
	 */
	@SuppressWarnings("unchecked")
	@Override
	public Class getObjectType() {
		return this.objectClass;
	}

	/**
	 * @return Always returns <code>false</code>.
	 */
	@Override
	public boolean isSingleton() {
		return true;
	}
}
