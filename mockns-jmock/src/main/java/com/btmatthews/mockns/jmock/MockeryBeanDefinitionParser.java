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

package com.btmatthews.mockns.jmock;

import org.jmock.Mockery;
import org.springframework.beans.factory.xml.AbstractSingleBeanDefinitionParser;
import org.w3c.dom.Element;

/**
 * The bean definition parser for the jMock mockery context objects.
 * 
 * @author <a href="mailto:brian@btmatthews.com">Brian Matthews</a>
 * @version 0.1.0
 */
public final class MockeryBeanDefinitionParser
    extends AbstractSingleBeanDefinitionParser
{
    /**
     * The default constructor.
     */
    public MockeryBeanDefinitionParser()
    {
    }

    /**
     * Get class of the factory used to create the beans.
     * 
     * @param element
     *            The element that defines the bean.
     * @return Always returns {@link MockFactoryBean}.
     * @see org.springframework.beans.factory.xml.AbstractSingleBeanDefinitionParser#getBeanClass(org.w3c.dom.Element)
     */
    @SuppressWarnings("rawtypes")
    @Override
    protected Class getBeanClass(final Element element)
    {
        return Mockery.class;
    }
}
