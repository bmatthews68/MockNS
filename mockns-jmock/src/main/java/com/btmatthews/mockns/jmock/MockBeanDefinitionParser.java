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

package com.btmatthews.mockns.jmock;

import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.xml.AbstractSingleBeanDefinitionParser;
import org.w3c.dom.Element;

/**
 * The bean definition parser for the EasyMock mock objects.
 * 
 * @author <a href="mailto:brian@btmatthews.com">Brian Matthews</a>
 * @version $Rev$
 */
public class MockBeanDefinitionParser extends
		AbstractSingleBeanDefinitionParser {

	/**
	 * The default constructor.
	 */
	public MockBeanDefinitionParser() {
	}

	/**
	 * @param element
	 * @param builder
	 */
	@Override
	protected void doParse(final Element element,
			final BeanDefinitionBuilder builder) {
		final String objectClass = element.getAttribute("object-class");
		builder.addConstructorArgValue(objectClass);
	}

	@SuppressWarnings("unchecked")
	@Override
	protected Class getBeanClass(final Element element) {
		return MockFactoryBean.class;
	}

	@Override
	protected boolean shouldGenerateIdAsFallback() {
		return true;
	}
}
