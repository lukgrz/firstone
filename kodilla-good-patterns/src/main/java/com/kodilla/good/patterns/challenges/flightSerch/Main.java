package com.kodilla.good.patterns.challenges.flightSerch;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        SearchFlightRetriever searchFlightRetriever = new SearchFlightRetriever();
        Set<Flight>flights = searchFlightRetriever.flightList();

        SearchService searchService = new SearchService();
        searchService.flightsFrom(flights,"Warszawa");
        System.out.println(" ");
        searchService.flightsTo(flights,"Katowice");
        System.out.println(" ");
        searchService.connectingFlights(flights,"Katowice","Kraków");

    }
}
