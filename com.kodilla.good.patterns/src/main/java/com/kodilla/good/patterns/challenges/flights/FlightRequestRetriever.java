package com.kodilla.good.patterns.challenges.flights;

public class FlightRequestRetriever {
    public FlightRequest retrieve(){
        City departure = new City("Krakow");
        City arrival = new City("Poznan");
        City transfer = new City("Warszawa");
        return new FlightRequest(departure, arrival, transfer);
    }
}
