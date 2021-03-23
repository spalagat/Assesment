package com.assesment.problem1.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class DuplicateInputException extends RuntimeException{
    public DuplicateInputException(String message) {
        super(message);
    }
}
