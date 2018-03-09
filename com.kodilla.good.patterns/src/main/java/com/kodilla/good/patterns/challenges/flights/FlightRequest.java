package com.kodilla.good.patterns.challenges.flights;

public class FlightRequest {
    private City departure;
    private City arrival;
    private City transfer;

    public FlightRequest(City departure, City arrival, City transfer) {
        this.departure = departure;
        this.arrival = arrival;
        this.transfer = transfer;
    }

    public City getDeparture() {
        return departure;
    }

    public City getArrival() {
        return arrival;
    }

    public City getTransfer() {
        return transfer;
    }
}
