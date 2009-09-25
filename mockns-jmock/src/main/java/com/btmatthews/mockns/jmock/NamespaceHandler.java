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

import org.springframework.beans.factory.xml.NamespaceHandlerSupport;

/**
 * The name-space hander for the jMock.
 * 
 * @author <a href="mailto:brian@btmatthews.com">Brian Matthews</a>
 * @version $Rev$
 */
public class NamespaceHandler
    extends NamespaceHandlerSupport
{
    /**
     * The default constructor.
     */
    public NamespaceHandler()
    {
    }

    /**
     * Register the bean definition parsers for the name-space.
     * 
     * @see org.springframework.beans.factory.xml.NamespaceHandler#init()
     */
    @Override
    public void init()
    {
        this.registerBeanDefinitionParser("mock", new MockBeanDefinitionParser());
        this.registerBeanDefinitionParser("mockery", new MockeryBeanDefinitionParser());
    }

}
