package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightSearch {

    public void findFlight(Flight flight) throws RouteNotFoundException {
        Map<String, Boolean> flightRoutes = new HashMap<>();
        flightRoutes.put("LTN",false);

        for (Map.Entry<String, Boolean> entry : flightRoutes.entrySet()) {
            if (flight.getArrivalAirport().equals(entry.getKey()) && entry.getValue())  {
                System.out.println("Możesz lecieć");
            } else {
                throw new RouteNotFoundException("Nie ma takiego połączenia");
            }
        }
    }
}
