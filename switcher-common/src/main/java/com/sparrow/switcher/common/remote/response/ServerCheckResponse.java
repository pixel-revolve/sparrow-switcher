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

package com.sparrow.switcher.common.remote.response;

/**
 * response of server check.
 *
 * @author pixel-revolve
 */
public class ServerCheckResponse extends Response {
    
    private String connectionId;
    
    private boolean supportAbilityNegotiation;
    
    public ServerCheckResponse() {
    
    }
    
    public ServerCheckResponse(String connectionId, boolean supportAbilityNegotiation) {
        this.connectionId = connectionId;
        this.supportAbilityNegotiation = supportAbilityNegotiation;
    }
    
    public String getConnectionId() {
        return connectionId;
    }
    
    public void setConnectionId(String connectionId) {
        this.connectionId = connectionId;
    }
    
    public boolean isSupportAbilityNegotiation() {
        return supportAbilityNegotiation;
    }
    
    public void setSupportAbilityNegotiation(boolean supportAbilityNegotiation) {
        this.supportAbilityNegotiation = supportAbilityNegotiation;
    }
}
