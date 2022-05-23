package com.bo.main.core.exception;

/**
 * EmptyDataException
 *
 * <pre>
 * 없는 데이터를 조회했을때 발생하는 예외
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
public class EmptyDataException extends BadRequestException {
    /**
     *
     */
    private static final long serialVersionUID = 7143279509897944297L;

    public EmptyDataException() {
        super("Empty Data", BadRequestDetail.EMPTY_DATA.value());
    }

    public EmptyDataException(String message) {
        super(message, BadRequestDetail.EMPTY_DATA.value());
    }

    public EmptyDataException(String message, int code) {
        super(message, code);
    }
}
