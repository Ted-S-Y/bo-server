package com.bo.main.core.client.coreapi.model;

import lombok.Builder;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

/**
 * Created by tjdudals20@gmail.com on 2020-02-17
 */
@Slf4j
@Data
@Builder
public class ResponseCommonAuthToken {

    int result;
    String expireIn;
    String token;
    String refreshToken;

    public boolean valid() {

//        LocalDateTime expireDt = DateTimeFormat.forPattern("yyyyMMddhhmmss").parseLocalDateTime(expireIn);
//        LocalDateTime currentDt = new LocalDateTime(DateTimeZone.UTC);
//
//        if (result != 0) {
//            log.info("### token valid error -> result : {} ", result);
//            return false;
//        }
//
//        if (currentDt.isAfter(expireDt)) {
//            log.info("### token valid error -> expireDt : {} , currentDt : {} ", expireDt, currentDt);
//            return false;
//        }

        return true;
    }
}
