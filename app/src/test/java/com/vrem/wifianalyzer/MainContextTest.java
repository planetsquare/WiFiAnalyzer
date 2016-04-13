/*
 *    Copyright (C) 2015 - 2016 VREM Software Development <VREMSoftwareDevelopment@gmail.com>
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */

package com.vrem.wifianalyzer;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricGradleTestRunner;
import org.robolectric.annotation.Config;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

@RunWith(RobolectricGradleTestRunner.class)
@Config(constants = BuildConfig.class)
public class MainContextTest {

    @Before
    public void setUp() throws Exception {
        RobolectricUtil.INSTANCE.getMainActivity();
    }

    @After
    public void tearDown() throws Exception {
        RobolectricUtil.INSTANCE.restore();
    }

    @Test
    public void testClear() throws Exception {
        // setup
        MainContext mainContext = MainContext.INSTANCE;
        assertTrue(mainContext.isInitialized());
        // execute
        mainContext.clear();
        // validate
        assertFalse(mainContext.isInitialized());
    }
}