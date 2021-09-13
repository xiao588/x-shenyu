/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.shenyu.intergratedtest.alibaba.dubbo;

import org.apache.shenyu.integratedtest.common.AbstractTest;
import org.apache.shenyu.integratedtest.common.dto.DubboTest;
import org.apache.shenyu.integratedtest.common.dto.AdminResponse;
import org.apache.shenyu.integratedtest.common.helper.HttpHelper;
import com.google.gson.reflect.TypeToken;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.assertEquals;

public class ApacheDubboPluginTest extends AbstractTest {

    @Test
    public void testFindById() throws IOException {
        AdminResponse<DubboTest> dubboTest = HttpHelper.INSTANCE.getFromGateway("/dubbo/findById?id=1", new TypeToken<AdminResponse<DubboTest>>() {
        }.getType());
        assertEquals("hello world shenyu Apache, findById", dubboTest.getData().getName());
    }
}