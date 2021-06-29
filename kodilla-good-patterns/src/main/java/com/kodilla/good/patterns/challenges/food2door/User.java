package com.kodilla.good.patterns.challenges.food2door;

public class User {
    private String id;
    private String adress;

    public User(String id, String adress) {
        this.id = id;
        this.adress = adress;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }
}
