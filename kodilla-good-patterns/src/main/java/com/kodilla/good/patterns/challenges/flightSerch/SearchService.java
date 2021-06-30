 package com.kodilla.good.patterns.challenges.flightSerch;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class SearchService {

    public Set<Flight> flightsFrom(Set<Flight> flights, String city){
        Set<Flight>resultFlights = flights.stream()
                .filter(flight -> flight.getDepartureAirport().getCity().equals(city))
                .collect(Collectors.toSet());
        return   resultFlights;
    }

    public Set<Flight> flightsTo(Set<Flight> flights, String city) {
        Set<Flight>resultFlights = flights.stream()
                .filter(flight -> flight.getArrivalAirport().getCity().equals(city))
                .collect(Collectors.toSet());
        return resultFlights;
    }

    public Map<Flight,Set<Flight>> connectingFlights(Set<Flight> flights, String departureCity, String arrivalCity){
        Map<Flight,Set<Flight>> transitFlights = new HashMap<>();

        Set<Flight>firstFlight = flights.stream()
                .filter(flight -> flight.getDepartureAirport().getCity().equals(departureCity))
                .collect(Collectors.toSet());

        for (Flight flight1:firstFlight) {
            Set<Flight> secondFlight = flights.stream()
                    .filter(flight -> flight.getDepartureAirport().getIataCode().equals(flight1.getArrivalAirport().getIataCode()))
                    .filter(flight -> flight.getArrivalAirport().getCity().equals(arrivalCity))
                    .collect(Collectors.toSet());
            if (secondFlight.size()>0) {
                transitFlights.put(flight1, secondFlight);
            }
        }
        return transitFlights;
    }
}
