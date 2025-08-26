package com.francadev.airportControl.api.models;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "tb_flight_class")
public class FlightClass {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long classFlightId;
    private Integer numberOfSeats;
    private Double price;
    private Integer classNumber;
    private String classDescription;
    private Integer initialSeat;
    private Integer finalSeat;

}
