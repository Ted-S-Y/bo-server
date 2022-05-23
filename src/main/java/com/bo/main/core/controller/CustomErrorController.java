package com.bo.main.core.controller;

import com.bo.main.core.wapper.ResultResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.HttpStatusCodeException;

import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;

@Controller
@Slf4j
public class CustomErrorController implements ErrorController {
    @Value("${error.path:/error}")
    private String errorPath;

    @Autowired
    private Environment environment;

    @RequestMapping(value = "/error", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public ResultResponse<?> error(HttpServletRequest request) {
        final Throwable error = getError(request);

        int statusCode = getErrorStatusCode(request);
        HttpStatus status = getHttpStatus(error);

        if (status == HttpStatus.UNAUTHORIZED) {
            statusCode = status.value();
        }

        log.error("Error occurred", error);

        int code = statusCode * 100;
        String errorMessage = (isProduction() && statusCode >= 500) ? "Server error" : getErrorMessage(request);

        ResultResponse errorResponse = new ResultResponse<>();
        errorResponse.setStatus(statusCode);
        errorResponse.setCode(code);
        errorResponse.setMessage(errorMessage);

        return errorResponse;
    }

    private boolean isProduction() {
        return !Arrays.asList(environment.getActiveProfiles()).contains("production");
    }

    private HttpStatus getHttpStatus(Throwable error) {
        HttpStatus status = HttpStatus.INTERNAL_SERVER_ERROR;

        if (error instanceof HttpStatusCodeException) {
            HttpStatusCodeException httpStatusCodeException = (HttpStatusCodeException) error;
            status = httpStatusCodeException.getStatusCode();
        }

        return status;
    }

    private Throwable getError(HttpServletRequest request) {
        return (Throwable) request.getAttribute("javax.servlet.error.exception");
    }

    private int getErrorStatusCode(HttpServletRequest request) {
        Integer statusCode = (Integer) request.getAttribute("javax.servlet.error.status_code");
        return statusCode != null ? statusCode : HttpStatus.INTERNAL_SERVER_ERROR.value();
    }

    private String getErrorMessage(HttpServletRequest request) {
        final Throwable exc = (Throwable) request.getAttribute("javax.servlet.error.exception");
        return exc != null ? exc.getMessage() : getErrorMessage(request, "Unexpected error occurred");
    }

    private String getErrorMessage(HttpServletRequest request, String defaultMessage) {
        Object message = request.getAttribute("javax.servlet.error.message");

        return ObjectUtils.isEmpty(message) ? defaultMessage : (String) message;
    }
}
