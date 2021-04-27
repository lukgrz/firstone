package com.kodilla.exception.test;

public class FlightFinderRunner {

    public static void main (String[]args){
        FlightSearch flightSearch = new FlightSearch();
        Flight flight = new Flight("KTW", "LTN");

        try {
            flightSearch.findFlight(flight);
        }catch (RouteNotFoundException e) {
            System.out.println("Sorry bro can't fly there");
        }
    }
}
