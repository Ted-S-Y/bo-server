package com.bo.main.core.advice;

import com.bo.main.core.exception.MyException;
import com.bo.main.core.exception.UnauthorizedException;
import com.bo.main.core.wapper.ResultResponse;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.TypeMismatchException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.validation.ValidationException;
import java.nio.file.AccessDeniedException;
import java.util.List;
import java.util.stream.Collectors;

@Slf4j
@RestControllerAdvice
public class ControllerExceptionAdvice {

    @ExceptionHandler(MyException.class)
    public ResponseEntity<ResultResponse> handleException(MyException e) {
        ResultResponse resultResponse = new ResultResponse(e.getHttpStatus());
        resultResponse.setMessage(e.getMessage());
        resultResponse.setCode(e.getCode());
        log.debug("#### {}", resultResponse);
        return new ResponseEntity<>(resultResponse, e.getHttpStatus());
    }

    @ExceptionHandler({ ValidationException.class, TypeMismatchException.class })
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ResultResponse handleValidateException(Exception e) {
        ResultResponse resultResponse = new ResultResponse(HttpStatus.BAD_REQUEST);
        resultResponse.setMessage(e.getMessage());
        resultResponse.setCode(40099);
        log.warn("#### {}", (Object) e.getStackTrace());

        return resultResponse;
    }

    @ExceptionHandler({ MethodArgumentNotValidException.class })
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ResultResponse handleMethodArgumentNotValidException(MethodArgumentNotValidException e) {
        ResultResponse resultResponse = new ResultResponse(HttpStatus.BAD_REQUEST);
        resultResponse.setCode(40099);

        List<String> errorMessages = e.getBindingResult().getFieldErrors().stream()
                .map(fe -> String.format("%s : %s", fe.getField(), fe.getDefaultMessage()))
                .collect(Collectors.toList());
        resultResponse.setMessage(StringUtils.join(errorMessages, ", "));

        log.warn("#### {}", (Object) e.getStackTrace());

        return resultResponse;
    }

    @ExceptionHandler({ AccessDeniedException.class, UnauthorizedException.class })
    @ResponseStatus(HttpStatus.UNAUTHORIZED)
    public ResultResponse handleException(AccessDeniedException e) {
        ResultResponse resultResponse = new ResultResponse(HttpStatus.UNAUTHORIZED);
        resultResponse.setCode(40100);
        resultResponse.setMessage(e.getMessage());
        return resultResponse;
    }

    @ExceptionHandler(Exception.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public ResultResponse handleException(Exception e) {
        ResultResponse resultResponse = new ResultResponse(HttpStatus.INTERNAL_SERVER_ERROR);
        resultResponse.setMessage(e.getMessage());
        log.warn("#### {}", e.toString());
        for (StackTraceElement stack : e.getStackTrace()) {
            log.warn("#### {}", stack);
        }
        return resultResponse;
    }
}
