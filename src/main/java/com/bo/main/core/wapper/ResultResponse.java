package com.bo.main.core.wapper;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;

/**
 * ResultResponse
 *
 * <pre>
 * API ResultResponse type
 * </pre>
 *
 * <pre>
 * <b>History:</b>
 * seominkyu, 1.0, 17/12/2018 초기작성
 * </pre>
 *
 * @author seominkyu
 * @version 1.0
 */
@Data
@NoArgsConstructor
public class ResultResponse<T> {

    @Schema(example = "0", description = "response status")
    private int status;

    @Schema(example = "", description = "response code")
    private int code;

    @Schema(example = "", description = "response message")
    private String message;

    @Schema(example = "Object or Array", description = "response result")
    private T result;

    public ResultResponse(T result) {
        if (result instanceof HttpStatus) {
            this.status = ((HttpStatus) result).value();
        } else {
            this.status = HttpStatus.OK.value();
        }
        this.message = "success";
        this.result = result;
    }
}
