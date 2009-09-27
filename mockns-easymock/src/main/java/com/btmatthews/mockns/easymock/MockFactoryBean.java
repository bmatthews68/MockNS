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

package com.btmatthews.mockns.easymock;

import org.easymock.classextension.EasyMock;
import org.springframework.beans.factory.FactoryBean;

/**
 * The factory bean that creates EasyMock mock objects.
 * 
 * @author <a href="mailto:brian@btmatthews.com">Brian Matthews</a>
 * @version 0.1.0
 */
public final class MockFactoryBean
    implements FactoryBean
{
    /**
     * The interface or class to be mocked.
     */
    @SuppressWarnings("unchecked")
    private Class objectClass;

    /**
     * The constructor.
     * 
     * @param clazz
     *            The interface or class to be mocked.
     */
    @SuppressWarnings("unchecked")
    public MockFactoryBean(final Class clazz)
    {
        this.objectClass = clazz;
    }

    /**
     * Create the mock object.
     * 
     * @return The mock object.
     */
    @SuppressWarnings("unchecked")
    @Override
    public Object getObject()
    {
        return EasyMock.createMock(this.objectClass);
    }

    /**
     * Return the interface or class that will be mocked.
     * 
     * @return The interface or class.
     */
    @SuppressWarnings("unchecked")
    @Override
    public Class getObjectType()
    {
        return this.objectClass;
    }

    /**
     * Indicate that mock objects created by this factory are singletons.
     * 
     * @return Always returns <code>true</code>.
     */
    @Override
    public boolean isSingleton()
    {
        return true;
    }
}
