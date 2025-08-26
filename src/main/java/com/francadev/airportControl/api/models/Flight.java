package com.francadev.airportControl.api.models;

import java.util.Date;
import java.util.List;

public class Flight {

    private Long flightId;
    private Airport airportOrigin;
    private Airport airportDestination;
    private Date flightDateAndTime;
    private List<FlightClass> flightClasses;
    private Integer totalNumberOfSeats;


}
