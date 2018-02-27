package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class RouteFinder {

    public Boolean findFlight(Flight flight) throws RouteNotFoundException{

        Map<String, Boolean> route = new HashMap<>();
        route.put("Lądek Zdrój",true);
        route.put("Berlin", true);
        route.put("Oslo", true);

        if(route.get(flight.getArrivalAirport()) != null){
            return (route.get(flight.getArrivalAirport()));
        }
        throw new RouteNotFoundException();
    }
}
