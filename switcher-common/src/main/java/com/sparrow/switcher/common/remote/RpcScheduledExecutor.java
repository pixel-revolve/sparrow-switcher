/*
 * Copyright 1999-2020 Alibaba Group Holding Ltd.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.sparrow.switcher.common.remote;

import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/**
 * rpc scheduler executor .
 *
 * @author pixel-revolve
 */
public class RpcScheduledExecutor extends ScheduledThreadPoolExecutor {
    
    public static final RpcScheduledExecutor TIMEOUT_SCHEDULER = new RpcScheduledExecutor(1,
            "com.sparrow.remote.TimerScheduler");
    
    public static final RpcScheduledExecutor CONTROL_SCHEDULER = new RpcScheduledExecutor(1,
            "com.sparrow.control.DelayScheduler");
    
    public static final RpcScheduledExecutor COMMON_SERVER_EXECUTOR = new RpcScheduledExecutor(1,
            "com.sparrow.remote.ServerCommonScheduler");
    
    public RpcScheduledExecutor(int corePoolSize, final String threadName) {
        super(corePoolSize, new ThreadFactory() {
            private final AtomicLong index = new AtomicLong();
            
            @Override
            public Thread newThread(Runnable r) {
                Thread thread = new Thread(r, threadName + "." + index.getAndIncrement());
                thread.setDaemon(true);
                return thread;
            }
        });
    }
    
}
