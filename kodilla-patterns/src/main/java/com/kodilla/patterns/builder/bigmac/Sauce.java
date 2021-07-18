package com.kodilla.patterns.builder.bigmac;

public class Sauce {

    public static final String STANDARD = "STANDARD";
    public static final String THOUSENDISLAND = "THOUSENDISLAND";
    public static final String BARBECUE = "BARBECUE";
    private final String sauceType;

    public Sauce(String sauceType) {
        if (sauceType.equals(STANDARD) || sauceType.equals(THOUSENDISLAND) || sauceType.equals(BARBECUE)) {
            this.sauceType = sauceType;
        } else {
            throw new IllegalStateException("You have 3 sauces to choose" +
                    STANDARD + ", " + THOUSENDISLAND + " and " + BARBECUE);
        }
    }
}
