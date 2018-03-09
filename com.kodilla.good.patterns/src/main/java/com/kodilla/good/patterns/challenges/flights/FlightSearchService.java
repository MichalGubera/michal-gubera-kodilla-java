package com.kodilla.good.patterns.challenges.flights;

import java.util.List;
import java.util.stream.Collectors;

public class FlightSearchService {

    public static List<Flight> getFlightsFromCity(City departure){
        return FlightConnections.getFlightConnection().stream()
                .filter(flight -> flight.getDeparture() == departure)
                .collect(Collectors.toList());
    }

    public static List<Flight> getFightsToCity(City arrival){
        return FlightConnections.getFlightConnection().stream()
                .filter(flight -> flight.getArrival() == arrival)
                .collect(Collectors.toList());
    }

    public static List<Flight> getDirectFlights(City departure, City arrival){
        return FlightConnections.getFlightConnection().stream()
                .filter(flight -> flight.getDeparture().equals(departure) && flight.getArrival().equals(arrival))
                .collect(Collectors.toList());
    }

    public static List<Flight> getTransfersTo(City departure, City transfer){
        return FlightConnections.getFlightConnection().stream()
                .filter(flight -> flight.getDeparture().equals(departure) && flight.getArrival().equals(transfer))
                .collect(Collectors.toList());
    }

    public static List<Flight> getTransfersFrom(City transfer, City arrival){
        return FlightConnections.getFlightConnection().stream()
                .filter(flight -> flight.getDeparture().equals(transfer) && flight.getArrival().equals(arrival))
                .collect(Collectors.toList());
    }

    public static void processConnection (final FlightRequest flightRequest){

        List<Flight> directFlight = FlightSearchService.getDirectFlights(flightRequest.getDeparture(),flightRequest.getArrival());
        directFlight.stream()
                .map(flight -> flight.toString().toUpperCase())
                .forEach(f -> System.out.println("Direct connection: " + f));
//                .collect(Collectors.toList());

        List<Flight> transfersToCity = FlightSearchService.getTransfersTo(flightRequest.getDeparture(),flightRequest.getTransfer());
        transfersToCity.stream()
                .map(flight -> flight.toString().toUpperCase())
                .forEach(f -> System.out.println("Connection to transfer point: " + f));
//                .collect(Collectors.toList());

        List<Flight> transferFromCity = FlightSearchService.getTransfersFrom(flightRequest.getTransfer(),flightRequest.getArrival());
        transferFromCity.stream()
                .map(flight -> flight.toString().toUpperCase())
                .forEach(f -> System.out.println("Connection from transfer point: " + f));
//                .collect(Collectors.toList());

//        final List<List<Flight>> connections = new LinkedList<>();

//        List<Flight> directFlight = FlightSearchService.getDirectFlights(flightRequest.getDeparture(),flightRequest.getArrival());
//        List<Flight> transfersToCity = FlightSearchService.getTransfersTo(flightRequest.getDeparture(),flightRequest.getTransfer());
//        List<Flight> transferFromCity = FlightSearchService.getTransfersFrom(flightRequest.getTransfer(),flightRequest.getArrival());
//        connections.add(directFlight);
//        connections.add(transfersToCity);
//        connections.add(transferFromCity);
//
//              connections.stream()
//                .flatMap(Collection::stream)
////                .collect(Collectors.toList());
//                .forEach(System.out::println);
    }
}
