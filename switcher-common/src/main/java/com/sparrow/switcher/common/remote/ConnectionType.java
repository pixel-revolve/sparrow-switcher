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

/**
 * ConnectionType.
 *
 * @author pixel-revolve
 */
public enum ConnectionType {
    
    /**
     * gRPC connection.
     */
    GRPC("GRPC", "Grpc Connection");
    
    final String type;
    
    final String name;
    
    public static ConnectionType getByType(String type) {
        ConnectionType[] values = ConnectionType.values();
        for (ConnectionType connectionType : values) {
            if (connectionType.getType().equals(type)) {
                return connectionType;
            }
        }
        return null;
    }
    
    ConnectionType(String type, String name) {
        this.type = type;
        this.name = name;
    }
    
    /**
     * Getter method for property <tt>type</tt>.
     *
     * @return property value of type
     */
    public String getType() {
        return type;
    }
    
    /**
     * Getter method for property <tt>name</tt>.
     *
     * @return property value of name
     */
    public String getName() {
        return name;
    }
}
