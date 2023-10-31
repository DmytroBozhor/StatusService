package com.example.statusproject.util;

import com.example.statusproject.entity.TicketEntity;
import com.example.statusproject.exception.TicketNotFoundException;
import com.example.statusproject.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class TicketIdValidator {
    private final TicketService ticketService;

    @Autowired
    public TicketIdValidator(TicketService ticketService) {
        this.ticketService = ticketService;
    }

    public TicketEntity validate(int id) {
        Optional<TicketEntity> ticket = ticketService.getById(id);
        if (ticket.isPresent()) {
            return ticket.get();
        } else throw new TicketNotFoundException("The ticket was not found");
    }
}
