package com.bo.main.core.exception;

import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatus;

/**
 * DigipartsException
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
@Getter
@Setter
public class MyException extends RuntimeException {
    /**
     *
     */
    private static final long serialVersionUID = 1L;
    private HttpStatus httpStatus;
    private int code;

    public MyException(HttpStatus httpStatus, String message) {
        super(message);
        this.httpStatus = httpStatus;
    }

    public MyException(String message) {
        super(message);
        this.httpStatus = HttpStatus.INTERNAL_SERVER_ERROR;
        this.code = 50000;
    }

    public MyException(HttpStatus httpStatus, int code, String message) {
        super(message);
        this.httpStatus = httpStatus;
        this.code = code;
    }

}
