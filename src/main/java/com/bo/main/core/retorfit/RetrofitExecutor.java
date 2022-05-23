package com.bo.main.core.retorfit;

import com.bo.main.core.exception.BadRequestException;
import lombok.extern.slf4j.Slf4j;
import retrofit2.Call;
import retrofit2.Response;

import java.io.IOException;
/**
 * Created by tjdudals20@gmail.com on 2020-02-14
 */
@Slf4j
public abstract class RetrofitExecutor<T> {
    public T execute(Call<T> call) {
        try {
            Response<T> response = call.execute();
            if (response.isSuccessful()) {
                log.debug("#### {}", response.body());
                return response.body();
            }
            log.error("#### {}", response.body());
            log.error("#### {}", response.errorBody().string());
            throw new BadRequestException(response.errorBody().string());
        } catch (IOException e) {
            log.error("#### {}", e);
            throw new BadRequestException(e.getMessage());
        }
    }
}
