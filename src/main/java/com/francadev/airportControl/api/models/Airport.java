package com.francadev.airportControl.api.models;

import jakarta.persistence.*;
import lombok.Data;
@Data
@Entity
@Table(name="tb_airport")
public class  Airport {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long airportId;
    private String uf;
    private String airportCity;
    private Integer iataCode;
    private String nameAirport;
}
