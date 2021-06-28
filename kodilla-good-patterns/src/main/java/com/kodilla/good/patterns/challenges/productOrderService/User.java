package com.kodilla.good.patterns.challenges.productOrderService;

public class User {
    private String nickName;
    private String name;
    private String surname;
    private String adress;

    public User(String nickName, String name, String surname, String adress) {
        this.nickName = nickName;
        this.name = name;
        this.surname = surname;
        this.adress = adress;
    }



    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }
}
