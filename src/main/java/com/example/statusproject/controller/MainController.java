package com.example.statusproject.controller;

import com.example.statusproject.entity.TicketEntity;
import com.example.statusproject.exception.TicketNotFoundException;
import com.example.statusproject.service.TicketService;
import com.example.statusproject.util.TicketIdValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class MainController {
    private final TicketService ticketService;
    private final TicketIdValidator ticketIdValidator;

    @Autowired
    public MainController(TicketService ticketService, TicketIdValidator ticketIdValidator) {
        this.ticketService = ticketService;
        this.ticketIdValidator = ticketIdValidator;
    }

    @PostMapping("/status")
    public ResponseEntity<Map<String, String>> getStatus(@RequestBody int id) {
        TicketEntity ticket = ticketIdValidator.validate(id);


        return null; //сделать обращение в бд по данному айти и вернуть статус заявки с этим айди
    }
}
