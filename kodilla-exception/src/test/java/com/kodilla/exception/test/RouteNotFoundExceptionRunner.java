package com.kodilla.exception.test;

import java.util.Map;

public class RouteNotFoundExceptionRunner {
    public static void main(String args[]){

        Flight flight = new Flight("Warsaw","Londyn");
        RouteFinder routeFinder = new RouteFinder();

        try {
            Boolean route = routeFinder.findFlight(flight);
        } catch (RouteNotFoundException e) {
            System.out.println("Error: " + e);
        }finally {
            System.out.println("Have a good flight! For more information contact local agent.");
        }

    }
}
