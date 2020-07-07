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
package org.apache.dubbo.common.context;

/**
 * The Lifecycle of Dubbo component
 * tony:Dubbo组件的生命周期。为每一个对象定义一个完整的生命周期，方便框架管理资源的初始化和释放等。
 * @since 2.7.5
 */
public interface Lifecycle {

    /**
     * Initialize the component before {@link #start() start}
     * // SPI加载的时候初始化
     * @return current {@link Lifecycle}
     * @throws IllegalStateException
     */
    void initialize() throws IllegalStateException;

    /**
     * Start the component
     *
     * @return current {@link Lifecycle}
     * @throws IllegalStateException
     */
    void start() throws IllegalStateException;

    /**
     * Destroy the component
     *
     * @throws IllegalStateException
     */
    void destroy() throws IllegalStateException;
}
