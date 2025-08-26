package com.francadev.airportControl.api.models;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name="airport")
@Data
public class Airport {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long flightId;
    private String uf;
    private String airportCity;
    private Integer iataCode;
    private String nameAirport;
}
