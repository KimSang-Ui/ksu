package com.ksu.restapi05.exception;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.Errors;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@ControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {

    @Override
    protected ResponseEntity<Object>
    handleMethodArgumentNotValid(MethodArgumentNotValidException ex,
                                 HttpHeaders headers,
                                 HttpStatusCode status,
                                 WebRequest request) {

//        List<FieldError> list = ex.getBindingResult().getFieldErrors();
//
//        List<String> errorMessage = new ArrayList<>();
//        List<String> errorReason = new ArrayList<>();
//
//        for(FieldError fieldError : list){
//            System.out.println("fieldError.getField() = " + fieldError.getField());
//            System.out.println("fieldError.getDefaultMessage() = " + fieldError.getDefaultMessage());
//            System.out.println("fieldError.getCode() = " + fieldError.getCode());
//
//            errorMessage.add(fieldError.getCode());
//            errorReason.add(fieldError.getField() +" : " + fieldError.getDefaultMessage());
////        }
//        list.stream().forEach(fieldError -> {
//            System.out.println("fieldError.getField() = " + fieldError.getField());
//            System.out.println("fieldError.getDefaultMessage() = " + fieldError.getDefaultMessage());
//            System.out.println("fieldError.getCode() = " + fieldError.getCode());
//        });
        List<String> errorMessage = ex.getBindingResult().getFieldErrors().stream()
                .map(fieldError -> fieldError.getCode())
                .collect(Collectors.toList());
        List<String> errorReason = ex.getBindingResult().getFieldErrors().stream()
                .map(fieldError -> fieldError.getField() + " : " + fieldError.getDefaultMessage())
                .collect(Collectors.toList());

        ErrorResponse errorResponse = ErrorResponse.builder()
                .message(errorMessage.toString())
                .reason(errorReason.toString())
                .build();
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errorResponse);


    }
}
// ctrl + F9 재실행