/*
 * Copyright (c) 2017, WSO2 Inc. (http://wso2.com) All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.wso2.carbon.business.messaging.admin.services.types;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.List;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * * This class represent a Protocols information object.
 */
@ApiModel(value = "Protocols", description = "The structure represents protocols supported by the Message Broker.")
@XmlRootElement
public class Protocols {
    @ApiModelProperty(value = "Protocols list.")
    private List<String> protocol;

    public void setProtocol(List<String> protocol) {
        this.protocol = protocol;
    }

    public List<String> getProtocol() {
        return protocol;
    }
}
