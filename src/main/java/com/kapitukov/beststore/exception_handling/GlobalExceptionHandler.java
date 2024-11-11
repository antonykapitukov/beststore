package com.kapitukov.beststore.exception_handling;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(NotFoundProductException.class)
    public ResponseEntity<ProductIncorrectData> handleNotFoundProductException(
            NotFoundProductException exception) {
        ProductIncorrectData error = new ProductIncorrectData(exception.getMessage());
        return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
    }
}
