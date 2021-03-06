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

package com.btmatthews.mockns.jmock.test;

import org.jmock.Expectations;
import org.jmock.Mockery;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Unit test the jMock implementation for MockNS.
 *
 * @author <a href="mailto:brian@btmatthews.com">brian@btmatthews.com</a>
 * @version 0.1.0
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration
public final class TestMockNamespaceWithAnonymousBean
{
    /**
     * Used to test the mocked object.
     */
    @Autowired
    private Service service;

    /**
     * The mocked object.
     */
    @Autowired
    private Dependency dependency;

    /**
     * The context for the mocked object.
     */
    @Autowired
    private Mockery mockery;

    /**
     * The default constructor.
     */
    public TestMockNamespaceWithAnonymousBean()
    {
    }

    /**
     * Test the mocked object.
     */
    @Test
    public void test()
    {
        this.mockery.checking(new Expectations()
        {
            {
                allowing(TestMockNamespaceWithAnonymousBean.this.dependency).doSomething();
            }
        });
        this.service.doSomething();
    }
}
