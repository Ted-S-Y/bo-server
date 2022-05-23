package com.bo.main.core.client.coreapi;

import com.bo.main.core.client.coreapi.model.*;
import com.bo.main.core.exception.BadRequestException;
import com.bo.main.core.retorfit.CoreApiExecutor;
import com.bo.main.core.retorfit.RetrofitFactory;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/**
 * Created by tjdudals20@gmail.com on 2020-02-17
 */

@Slf4j
@Component
@RequiredArgsConstructor
public class CoreApiHandler {

    private @NonNull CoreApiProperties properties;
    private @NonNull RetrofitFactory<CoreApiService> baseFactory;
    private CoreApiService coreApiService;

    private ResponseCommonAuthToken authToken;

    public boolean validToken() {
        if (authToken != null) {
            return authToken.valid();
        }
        return false;
    }

//    @PostConstruct
    public CoreApiHandler auth() {
        Map<String, String> baseHeaders = new HashMap<>();
        baseHeaders.put("Content-Type", "application/json;charset=utf-8");
        if (validToken()) {
            baseHeaders.put("Content-Type", "application/json;charset=utf-8");
            baseHeaders.put("Authorization", "Bearer " + authToken.getToken());
            this.coreApiService = baseFactory.createService(properties.getBaseDomain(), CoreApiService.class, baseHeaders);
        } else {
            this.coreApiService = baseFactory.createService(properties.getBaseDomain(), CoreApiService.class, baseHeaders);
            ResponseCommonAuth response = this.getAuth( properties.getClientId(), properties.getSecureCode(), "");
            log.info("### response auth -> {}",  response);

            if (response.getResult() == 0) {
                String authorizeCode = response.getAuthorizeCode();

                authToken = this.getAuthToken(properties.getClientId(), authorizeCode, "");
                log.info("### response token -> {}",  response);

                if (response.getResult() == 0) {
                    auth();
                } else {
                   throw new BadRequestException("CORE-API ERROR : common.auth.token (" + authToken.getResult()+ ")");
                }

            } else {
                throw new BadRequestException("CORE-API ERROR : common.auth (" + response.getResult()+ ")");
            }
        }

        return this;
    }

    private Map<String, String> buildHeader(String apiKey) {
        Map<String, String> trackingHeaders = new HashMap<>();
        trackingHeaders.put("Content-Type", "application/json;charset=utf-8");
        return trackingHeaders;
    }

    public ResponseCommonAuth getAuth(String clientId, String securedCode, String redirectURI) {
        return new CoreApiExecutor<ResponseCommonAuth>().execute(coreApiService.getCommonAuth(clientId, securedCode, UUID.randomUUID().toString(), redirectURI));
    }

    public ResponseCommonAuthToken getAuthToken(String clientId, String authorizeCode, String redirectURI) {

        RequestCommonAuthToken body = RequestCommonAuthToken.builder()
                .clientID(clientId)
                .authorizeCode(authorizeCode)
                .redirectURI(redirectURI)
                .build();

        return new CoreApiExecutor<ResponseCommonAuthToken>().execute(coreApiService.getCommonAuthToken(body));
    }

    public ResponseIgnitionSecurity getIgnitionSecurity(String clientId, String terminalId) {

        RequestIgnitionSecurityGet body = RequestIgnitionSecurityGet.builder()
                .terminalID(terminalId)
                .callbackURI(properties.getCallBackUrlStaringGet())
                .build();

        return new CoreApiExecutor<ResponseIgnitionSecurity>().execute(coreApiService.getIgnitionSecurity(clientId, body));
    }

    public ResponseIgnitionSecurity setIgnitionSecurity(String clientId, String terminalId, String controlOption, String controlType) {

        RequestIgnitionSecuritySet body = RequestIgnitionSecuritySet.builder()
                .terminalID(terminalId)
                .controlOption(controlOption)
                .controlType(controlType)
                .callbackURI(properties.getCallBackUrlStaringSet())
                .build();

        return new CoreApiExecutor<ResponseIgnitionSecurity>().execute(coreApiService.setIgnitionSecurity(clientId, body));
    }
}
