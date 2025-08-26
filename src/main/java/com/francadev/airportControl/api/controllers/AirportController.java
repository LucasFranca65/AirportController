package com.francadev.airportControl.api.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/airports")
public class AirportController {

    @GetMapping
    public String getAirports() {
        return "Lista de Aeroportos";
    }

    @PostMapping
    public String airportRegistration(){
        return "Aeroporto registrado";
    }

    @PutMapping
    public String updateAirportRegistration(){
        return "Aeroporto atualizado";
    }

    @DeleteMapping
    public String deleteAirportRegistration(){
        return "Aeroporto deletado";
    }

}
