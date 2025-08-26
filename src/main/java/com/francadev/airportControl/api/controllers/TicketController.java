package com.francadev.airportControl.api.controllers;

import com.francadev.airportControl.api.models.Flight;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/tickets")
public class TicketController {

    @GetMapping
    public String getAllTickets() {
        return "Lista de tickets vendidos";
    }

    @PostMapping
    public String registerTicket(Flight flight) {
        return "Registro de passagem";
    }

    @PutMapping
    public String updateTicket(Flight flight) {
        return "Atualização de Voos";
    }

    @DeleteMapping
    public String deleteTicket(Flight flight) {
        return "Deletado de Voos";
    }

}
