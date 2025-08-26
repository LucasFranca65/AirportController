package com.francadev.airportControl.api.controllers;

import com.francadev.airportControl.api.models.Flight;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/flight")
public class FlightController {

    @GetMapping
    public String getFlights() {
        return "Lista de Voos";
    }

    @PostMapping
    public String registerFlight(Flight flight) {
       return "Registro de Voos";
    }

    @PutMapping
    public String updateFlight(Flight flight) {
        return "Atualização de Voos";
    }

    @DeleteMapping
    public String deleteFlight(Flight flight) {
        return "Deletado Voo";
    }


}
