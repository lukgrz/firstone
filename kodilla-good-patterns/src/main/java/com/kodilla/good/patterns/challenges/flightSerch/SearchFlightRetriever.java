package com.kodilla.good.patterns.challenges.flightSerch;

import com.sun.source.tree.ReturnTree;

import java.util.HashSet;
import java.util.Set;

public class SearchFlightRetriever {

    public Set<Flight> flightList() {
        Set<Flight>flights = new HashSet<>();
        Airport wmi = new Airport("Warszawa", "WMI");
        Airport waw = new Airport("Warszawa", "WAW");
        Airport ktw = new Airport("Katowice", "KTW");
        Airport krk = new Airport("Kraków", "KRK");
        Airport yyz = new Airport("Toronto", "YYZ");

        flights.add(new Flight(wmi, krk, "LO0001"));
        flights.add(new Flight(krk, wmi, "LO0011"));
        flights.add(new Flight(ktw, waw, "LO0002"));
        flights.add(new Flight(waw, ktw, "LO0012"));
        flights.add(new Flight(ktw, krk, "LO0003"));
        flights.add(new Flight(krk, ktw, "LO0013"));
        flights.add(new Flight(krk, waw, "LO0004"));
        flights.add(new Flight(waw, krk, "LO0014"));
        flights.add(new Flight(waw, yyz, "LO9991"));
        flights.add(new Flight(yyz, waw, "LO9992"));

        return flights;
    }

}
