package com.kodilla.good.patterns.challenges.flightSerch;

import java.util.Set;

public class Airport {
    private final String city;
    private final String iataCode;
    private Set<Flight> flights;

    public Airport(String city, String iataCode) {
        this.city = city;
        this.iataCode = iataCode;
    }

    @Override
    public String toString() {
        return  city + "(" + iataCode + ")";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Airport airport = (Airport) o;

        if (!city.equals(airport.city)) return false;
        return iataCode.equals(airport.iataCode);
    }

    @Override
    public int hashCode() {
        int result = city.hashCode();
        result = 31 * result + iataCode.hashCode();
        return result;
    }

    public String getCity() {
        return city;
    }

    public Set<Flight> getFlights() {
        return flights;
    }

    public void setFlights(Set<Flight> flights) {
        this.flights = flights;
    }

    public String getIataCode() {
        return iataCode;
    }
}
