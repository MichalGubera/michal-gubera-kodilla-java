package com.kodilla.good.patterns.challenges.flights;

import java.util.HashSet;
import java.util.Set;

public final class FlightConnections {
    public static Set<Flight> getFlightConnection (){
        final Set<Flight> flightSet = new HashSet<>();
        flightSet.add(new Flight(new City("Warszawa"), new City("Gdansk")));
        flightSet.add(new Flight(new City("Warszawa"), new City("Krakow")));
        flightSet.add(new Flight(new City("Warszawa"), new City("Poznan")));
        flightSet.add(new Flight(new City("Warszawa"), new City("Wroclaw")));
        flightSet.add(new Flight(new City("Gdansk"), new City("Warszawa")));
        flightSet.add(new Flight(new City("Gdansk"), new City("Poznan")));
        flightSet.add(new Flight(new City("Gdansk"), new City("Wroclaw")));
        flightSet.add(new Flight(new City("Krakow"), new City("Warszawa")));
        flightSet.add(new Flight(new City("Krakow"), new City("Poznan")));
        flightSet.add(new Flight(new City("Poznan"), new City("Krakow")));
        flightSet.add(new Flight(new City("Poznan"), new City("Gdansk")));
        flightSet.add(new Flight(new City("Poznan"), new City("Warszawa")));
        flightSet.add(new Flight(new City("Wroclaw"), new City("Gdansk")));
        flightSet.add(new Flight(new City("Wroclaw"), new City("Warszawa")));
        return new HashSet<Flight>(flightSet);
    }
}
