package com.example.statusproject.service;

import com.example.statusproject.entity.TicketEntity;
import com.example.statusproject.repository.TicketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class TicketService {
    private final TicketRepository ticketRepository;
    @Autowired
    public TicketService(TicketRepository ticketRepository) {
        this.ticketRepository = ticketRepository;
    }

    public Optional<TicketEntity> getById(int id) {
        return ticketRepository.findById(id);
    }
}
