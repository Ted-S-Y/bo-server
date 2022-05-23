package com.bo.main.core.exception;

import org.springframework.http.HttpStatus;

/**
 * UnauthorizedException
 *
 * <pre>
 * 인증 없는 없이 api를 요청했을때 발생하는 예외 (401)
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
public class UnauthorizedException extends MyException {
    /**
     *
     */
    private static final long serialVersionUID = 2796309121744500263L;

    public UnauthorizedException() {
        super(HttpStatus.UNAUTHORIZED, 40100, HttpStatus.UNAUTHORIZED.getReasonPhrase());
    }

    public UnauthorizedException(String message) {
        super(HttpStatus.UNAUTHORIZED, 40100, message);
    }

    public UnauthorizedException(String message, int code) {
        super(HttpStatus.UNAUTHORIZED, code, message);
    }
}
