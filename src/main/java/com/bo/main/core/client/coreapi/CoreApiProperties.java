package com.bo.main.core.client.coreapi;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by tjdudals20@gmail.com on 2020-02-17
 */
@Data
@Component
public class CoreApiProperties {

    @Value("${api.base.domain}")
    private String baseDomain;

//    @Value("${coreapi.base.clientId}")
    private String clientId;

//    @Value("${coreapi.base.secureCode}")
    private String secureCode;

//    @Value("${cabllback.starting.get}")
    private String callBackUrlStaringGet;

//    @Value("${cabllback.starting.set}")/**/
    private String callBackUrlStaringSet;
}
