package com.kodilla.patterns.builder.bigmac;

import java.util.ArrayList;
import java.util.List;

public class Bigmac {

    private final String bun;
    private final int burgers;
    private final String sauce;
    private List<Ingredient> ingredients = new ArrayList<>();

    public Bigmac(final String bun, final int burgers, final String sauce, List<Ingredient> ingredients) {
        this.bun = bun;
        this.burgers = burgers;
        this.sauce = sauce;
        this.ingredients = new ArrayList<>(ingredients);
    }

    public String getBun() {
        return bun;
    }

    public int getBurgers() {
        return burgers;
    }

    public String getSauce() {
        return sauce;
    }

    public List<Ingredient> getIngredients() {
        return ingredients;
    }

    @Override
    public String toString() {
        return "Bigmac{" +
                "bun='" + bun + '\'' +
                ", burgers=" + burgers +
                ", sauce='" + sauce + '\'' +
                ", ingredients=" + ingredients +
                '}';
    }

    public static class BigmacBuilder {

        private String bun;
        private int burgers;
        private String sauce;
        private List<Ingredient> ingredients = new ArrayList<>();

        public BigmacBuilder bun (String bun) {
            this.bun = bun;
            return this;
        }

        public BigmacBuilder burgers (int burgers) {
            this.burgers = burgers;
            return this;
        }

        public BigmacBuilder sauce (String sauce) {
            this.sauce = sauce;
            return this;
        }

        public BigmacBuilder ingredient (Ingredient ingredient) {
            ingredients.add(ingredient);
            return this;
        }

        public Bigmac build () {
            return new Bigmac(bun, burgers, sauce, ingredients);
        }
    }
}