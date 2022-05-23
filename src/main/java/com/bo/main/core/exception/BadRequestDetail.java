package com.bo.main.core.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * BadRequestDetail
 *
 * <pre>
 * BadRequest 를 응답할때 Client 에게 전달하는
 * BadRequest Detail code 는 50번 이상부터 정의합니다.
 * </pre>
 *
 * <pre>
 * <b>History:</b>
 * seominkyu, 1.0, 10/01/2019 초기작성
 * </pre>
 *
 * @author seominkyu
 * @version 1.0
 */
@Getter
@AllArgsConstructor
public enum BadRequestDetail {
    /**
     * 일반적인 BadRequest 유효하지 않은 요청했습니다.
     */
    INVALID_PARAMETER(40001),
    /**
     * 유효하지 않은 값을 요청하여, 요청 결과가 없습니다.
     */
    EMPTY_DATA(40002),
    /**
     * 요청한 조회 결과가 너무 많을 것으로 예상됩니다. 좀 더 구체적인 요청을 제안 바랍니다.
     */
    REQUEST_RESULT_TOO_LARGE(40050),
    /**
     * Java 또는 Spring level 의 유효성 검사를 통과하지 못했습니다.
     */
    DEFAULT_INVALID_PARAMETER(40099);

    private int code;

    /**
     * Return the integer value of this status code.
     */
    public int value() {
        return this.code;
    }
}
