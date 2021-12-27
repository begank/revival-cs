package com.begank.common.exception;

import com.begank.common.web.Response;
import lombok.extern.java.Log;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @Author : begank
 * @Date: 2021-12-26 21:49
 */
@RestControllerAdvice
@Log
public class GlobalExceptionHandler {

    @ExceptionHandler(Exception.class)
    public Response handleDefaultException(Exception e){
        log.info("exception " + e);
        return Response.fail();
    }
}
