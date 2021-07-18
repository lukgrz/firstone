package com.kodilla.patterns.builder.pizza;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class Pizza {

    private final String bottom;
    private final String souce;
    private List<String> ingredients = new ArrayList<>();

    public static class PizzaBuilder {

        private String bottom;
        private String souce;
        private List<String> ingredients = new ArrayList<>();

        public PizzaBuilder bottom(String bottom) {
            this.bottom = bottom;
            return this;
        }

        public PizzaBuilder souce(String souce) {
            this.souce = souce;
            return this;
        }

        public PizzaBuilder ingredient(String ingredient) {
            ingredients.add(ingredient);
            return this;
        }

        public Pizza build() {
            return new Pizza(bottom, souce, ingredients);
        }
    }

        private Pizza(final String bottom, final String souce, List<String> ingredients) {
        this.bottom = bottom;
        this.souce = souce;
        this.ingredients = new ArrayList<>(ingredients);
    }

    public String getBottom() {
        return bottom;
    }

    public String getSouce() {
        return souce;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "bottom='" + bottom + '\'' +
                ", souce='" + souce + '\'' +
                ", ingredients=" + ingredients +
                '}';
    }
}
