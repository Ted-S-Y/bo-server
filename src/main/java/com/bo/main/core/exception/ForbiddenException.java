package com.bo.main.core.exception;

import org.springframework.http.HttpStatus;

/**
 * ForbiddenException
 *
 * <pre>
 * 권한이 없는 값을 요청했을때 발생하는 예외 (403)
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
public class ForbiddenException extends MyException {
    /**
     *
     */
    private static final long serialVersionUID = -1695766200862554488L;

    public ForbiddenException() {
        super(HttpStatus.FORBIDDEN, 40300, "Forbidden.");
    }

    public ForbiddenException(String message) {
        super(HttpStatus.FORBIDDEN, 40300, message);
    }
}
