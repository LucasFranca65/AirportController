package com.francadev.airportControl.api.models;

import jakarta.persistence.*;
import lombok.Data;


import java.util.Date;
import java.util.List;

@Data
@Entity
@Table(name = "tb_flights")
public class Flight {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long flightId;
    @ManyToOne
    private Airport airportOrigin;
    @ManyToOne
    private Airport airportDestination;
    private Date flightDateAndTime;
    @OneToMany
    private List<FlightClass> flightClasses;
    private Integer totalNumberOfSeats;


}
