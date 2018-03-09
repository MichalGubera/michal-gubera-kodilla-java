package com.kodilla.good.patterns.challenges.flights;

import java.util.List;

public class ApplicationFlights {
    public static void main(String args[]){
        FlightRequestRetriever flightRequestRetriever = new FlightRequestRetriever();
        FlightRequest flightRequest = flightRequestRetriever.retrieve();

        FlightSearchService.processConnection(flightRequest);
    }
}
