package com.kodilla.stream.world;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public final class Continent {
    public final String continentName;
    public Set<Country> countries = new HashSet<>();

    public Continent(final String continentName) {
        this.continentName = continentName;
    }

    public void addCountry (Country country){
        countries.add(country);
    }

    public boolean removeCountry (Country country) {
        return countries.remove(country);
    }

    public String getContinentName() {
        return continentName;
    }

    public Set<Country> getCountries() {
        return countries;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Continent continent = (Continent) o;

        return continentName.equals(continent.continentName);
    }

    @Override
    public int hashCode() {
        return continentName.hashCode();
    }
}
