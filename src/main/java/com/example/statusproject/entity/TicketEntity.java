package com.example.statusproject.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table(name = "ticket")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class TicketEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "route_number")
    private String routeNumber;
    @Column(name = "timestamp")
    private LocalDateTime timestamp;
}
