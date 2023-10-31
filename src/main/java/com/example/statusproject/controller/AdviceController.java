package com.example.statusproject.controller;

import com.example.statusproject.exception.TicketNotFoundException;
import com.example.statusproject.util.TicketNotFoundResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.time.LocalDateTime;

@RestControllerAdvice
public class AdviceController {

    @ExceptionHandler(TicketNotFoundException.class)
    public ResponseEntity<TicketNotFoundResponse> handleTicketNotFoundException(TicketNotFoundException e) {
        TicketNotFoundResponse response = new TicketNotFoundResponse(e.getMessage(), LocalDateTime.now());
        return new ResponseEntity<>(response, HttpStatus.BAD_REQUEST);
    }
}
