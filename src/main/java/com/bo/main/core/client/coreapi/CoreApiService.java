package com.bo.main.core.client.coreapi;

import com.bo.main.core.client.coreapi.model.*;
import retrofit2.Call;
import retrofit2.http.*;

/**
 * Created by tjdudals20@gmail.com on 2020-02-17
 */
public interface CoreApiService {

    @GET("/ccgf/v1/common.auth")
    Call<ResponseCommonAuth> getCommonAuth(@Query("clientID") String clientID
            ,@Query("securedCode") String securedCode
            ,@Query("sessionID") String sessionID
            ,@Query("redirectURI") String redirectURI
    );

    @POST("/ccgf/v1/common.auth.token")
    Call<ResponseCommonAuthToken> getCommonAuthToken(@Body RequestCommonAuthToken body);

    @POST("/ccgf/v1/csi.terminal.setting.ignition.security/{clientId}/get")
    Call<ResponseIgnitionSecurity> getIgnitionSecurity(@Path("clientId") String clientId, @Body RequestIgnitionSecurityGet body);

    @POST("/ccgf/v1/csi.terminal.setting.ignition.security/{clientId}/set")
    Call<ResponseIgnitionSecurity> setIgnitionSecurity(@Path("clientId") String clientId, @Body RequestIgnitionSecuritySet body);

}
