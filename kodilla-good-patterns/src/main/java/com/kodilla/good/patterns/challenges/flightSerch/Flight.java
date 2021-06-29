package com.kodilla.good.patterns.challenges.flightSerch;

public class Flight {
    private final Airport departureAirport;
    private final Airport arrivalAirport;
    private final String flightNumber;

    public Flight(Airport departureAirport, Airport arrivalAirport, String flightNumber) {
        this.departureAirport = departureAirport;
        this.arrivalAirport = arrivalAirport;
        this.flightNumber = flightNumber;
    }

    @Override
    public String toString() {
        return  departureAirport + " - "+ arrivalAirport + " Flight number" + flightNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Flight flight = (Flight) o;

        return flightNumber.equals(flight.flightNumber);
    }

    @Override
    public int hashCode() {
        return flightNumber.hashCode();
    }

    public Airport getDepartureAirport() {
        return departureAirport;
    }

    public Airport getArrivalAirport() {
        return arrivalAirport;
    }

    public String getFlightNumber() {
        return flightNumber;
    }
}
