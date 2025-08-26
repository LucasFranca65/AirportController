package com.francadev.airportControl.api.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/classes")
public class FlightClassController {
    @GetMapping
    public String getFlightClasses() {
        return "Lista de Classes de Voos";
    }

    @PostMapping
    public String FlightClassRegistration(){
        return "classe do voo registrado";
    }

    @PutMapping
    public String updateFlightClassRegistration(){
        return "Classe atualizada";
    }

    @DeleteMapping
    public String deleteFlightClassRegistration(){
        return "classe deletado";
    }
}
