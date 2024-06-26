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

package com.sparrow.switcher.common.remote.client;

import com.sparrow.switcher.common.remote.request.Request;
import com.sparrow.switcher.common.remote.response.Response;

/**
 * ServerRequestHandler, to process the request from server side.
 *
 * @author pixel-revolve
 */
public interface ServerRequestHandler {
    
    /**
     * Handle request from server.
     *
     * @param request request
     * @param connection current connection, it can be used to know server ability
     * @return response.
     */
    Response requestReply(Request request, Connection connection);
    
}
