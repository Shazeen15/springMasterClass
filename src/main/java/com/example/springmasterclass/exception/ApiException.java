package com.example.springmasterclass.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.http.HttpStatus;

import java.time.ZonedDateTime;

@AllArgsConstructor
@Getter
@Setter
@ToString
public class ApiException {
    private final String message;

    private final Throwable throwable;

    private final HttpStatus httpStatus;

    private final ZonedDateTime zonedDateTime;


}
