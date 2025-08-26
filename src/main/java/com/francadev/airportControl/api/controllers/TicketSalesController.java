package com.francadev.airportControl.api.controllers;

import com.francadev.airportControl.api.models.Flight;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/ticketSales")
public class TicketSalesController {

    @GetMapping
    public String homepageTicketSales(){
        return "homepage ticket Sales";
    }

    @PostMapping
    public String registerTicketSale(Flight flight) {
        return "Registro de Voos";
    }

    @PutMapping
    public String updateTicketSale(Flight flight) {
        return "Atualização de Voos";
    }

    @DeleteMapping
    public String deleteTicketSale(Flight flight) {
        return "Deletado de Voos";
    }


}
