package com.example.springmasterclass.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.ZonedDateTime;

@ControllerAdvice
public class ApiExceptionHandler {
    @ExceptionHandler(value = ApiRequestException.class)
    public ResponseEntity<Object> handleApiRequestException(ApiRequestException ae) {
        ApiException apiException = new ApiException(ae.getMessage(),
            ae,
            HttpStatus.BAD_REQUEST,
            ZonedDateTime.now());

        return new ResponseEntity<>(apiException,
            HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(value = NotFoundException.class)
    public ResponseEntity<Object> handleNotFoundException(NotFoundException nfe) {
        ApiException apiException = new ApiException(nfe.getMessage(),
            nfe,
            HttpStatus.NOT_FOUND,
            ZonedDateTime.now());

        return new ResponseEntity<>(apiException,
            HttpStatus.NOT_FOUND);
    }
}
