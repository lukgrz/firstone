package com.kodilla.good.patterns.challenges.flightSerch;

import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class SearchService {

    public void flightsFrom(Set<Flight> flights, String city){
        flights.stream()
                .filter(flight -> flight.getDepartureAirport().getCity().equals(city))
                .forEach(System.out::println);
    }

    public void flightsTo(Set<Flight> flights, String city) {
        flights.stream()
                .filter(flight -> flight.getArrivalAirport().getCity().equals(city))
                .forEach(System.out::println);
    }

    public void connectingFlights(Set<Flight> flights, String departureCity, String arrivalCity){
        flights.stream()
                .filter(flight -> flight.getDepartureAirport().getCity().equals(departureCity))
                .map(flight -> flight.getArrivalAirport().getIataCode())
                .forEach(transitAirport -> flights.stream()
                        .filter(flight -> flight.getDepartureAirport().getIataCode().equals(transitAirport))
                        .filter(flight -> flight.getArrivalAirport().getCity().equals(arrivalCity))
                        .forEach(System.out::println));
    }

}
