package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

public final class World {
    private Set<Continent> continents = new HashSet<>();

    public void addContinent (Continent continent){
        continents.add(continent);
    }

    public boolean removeContinent (Continent continent) {
        return continents.remove(continent);
    }

    public BigDecimal getPeopleQunatity(){
        return continents.stream()
                .flatMap(continent -> continent.countries.stream())
                .map(Country::getPeopleQuantity)
                .reduce(BigDecimal.ZERO,(sum, current)-> sum = sum.add(current));
    }

}
