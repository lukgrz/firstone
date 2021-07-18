package com.kodilla.patterns.builder.bigmac;

public class Bun {

    public static final String BUNSTANDARD = "BUNSTANDARD";
    public static final String BUNWITHSESAME = "BUNWITHSESAME";
    private final String bunType;

    public Bun(String bunType) {
        if (bunType.equals(BUNSTANDARD)||bunType.equals(BUNWITHSESAME)) {
            this.bunType = bunType;
        } else {
            throw new IllegalStateException("Wrong bun");
        }
    }

    public String getBunType() {
        return bunType;
    }
}
