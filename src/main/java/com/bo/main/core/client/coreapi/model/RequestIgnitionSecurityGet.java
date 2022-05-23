package com.bo.main.core.client.coreapi.model;

import lombok.Builder;
import lombok.Data;

/**
 * Created by tjdudals20@gmail.com on 2020-02-17
 */
@Data
@Builder
public class RequestIgnitionSecurityGet {
    private String terminalID;
    private String callbackURI;
}
