package com.bo.main.core.exception;

import org.springframework.http.HttpStatus;

/**
 * BadRequestException
 *
 * <pre>
 * Describe here
 * </pre>
 *
 * <pre>
 * <b>History:</b>
 * seominkyu, 1.0, 10/01/2019 초기작성
 * </pre>
 *
 * @author seominkyu
 * @version 1.0
 *
 */
public class BadRequestException extends MyException {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    public BadRequestException() {
        super(HttpStatus.BAD_REQUEST, BadRequestDetail.INVALID_PARAMETER.value(),
                HttpStatus.BAD_REQUEST.getReasonPhrase());
    }

    public BadRequestException(String message) {
        super(HttpStatus.BAD_REQUEST, BadRequestDetail.INVALID_PARAMETER.value(), message);
    }

    public BadRequestException(String message, int code) {
        super(HttpStatus.BAD_REQUEST, code, message);
    }

    public BadRequestException(String message, BadRequestDetail detail) {
        super(HttpStatus.BAD_REQUEST, detail.value(), message);
    }
}
