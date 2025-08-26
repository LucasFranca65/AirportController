package com.francadev.airportControl.api.models;

import lombok.Data;

import java.util.Date;

@Data
public class Ticket {

    private Long ticketId;
    private Flight flight;
    private FlightClass flightClass;
    private Integer seatNumber;
    private String passingName;
    private Date dateOfBirth;
    private String passingEmail;
    private String passingPhone;

}
