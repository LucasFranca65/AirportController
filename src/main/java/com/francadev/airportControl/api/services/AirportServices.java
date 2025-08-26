package com.francadev.airportControl.api.services;

import com.francadev.airportControl.api.models.Airport;
import com.francadev.airportControl.api.repositories.AirportRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AirportServices {

    @Autowired
    private AirportRepository airportRepository;

    public List<Airport> getAllAirport(){
        return airportRepository.findAll();
    }

    public Airport getAirportById(Long id){
        return airportRepository.getReferenceById(id);
    }



}
