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

package com.sparrow.switcher.common.remote.request;

import static com.sparrow.switcher.common.constants.Constants.INTERNAL_MODULE;

/**
 * ConnectResetRequest.
 *
 * @author pixel-revolve
 */
public class ConnectResetRequest extends ServerRequest {
    
    String serverIp;
    
    String serverPort;
    
    String connectionId;
    
    @Override
    public String getModule() {
        return INTERNAL_MODULE;
    }
    
    /**
     * Getter method for property <tt>connectionId</tt>.
     *
     * @return property value of connectionId
     */
    public String getConnectionId() {
        return connectionId;
    }
    
    /**
     * Setter method for property <tt>connectionId</tt>.
     *
     * @param connectionId value to be assigned to property connectionId
     */
    public void setConnectionId(String connectionId) {
        this.connectionId = connectionId;
    }
    
    /**
     * Getter method for property <tt>serverIp</tt>.
     *
     * @return property value of serverIp
     */
    public String getServerIp() {
        return serverIp;
    }
    
    /**
     * Setter method for property <tt>serverIp</tt>.
     *
     * @param serverIp value to be assigned to property serverIp
     */
    public void setServerIp(String serverIp) {
        this.serverIp = serverIp;
    }
    
    /**
     * Getter method for property <tt>serverPort</tt>.
     *
     * @return property value of serverPort
     */
    public String getServerPort() {
        return serverPort;
    }
    
    /**
     * Setter method for property <tt>serverPort</tt>.
     *
     * @param serverPort value to be assigned to property serverPort
     */
    public void setServerPort(String serverPort) {
        this.serverPort = serverPort;
    }
}
