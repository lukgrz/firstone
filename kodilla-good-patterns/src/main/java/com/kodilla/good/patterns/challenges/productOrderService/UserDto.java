package com.kodilla.good.patterns.challenges.productOrderService;

public class UserDto {
    public String nickName;

    public UserDto(final String nickName) {
        this.nickName = nickName;
    }

    public String getNickName() {
        return nickName;
    }

    @Override
    public String toString() {
        return nickName;
    }
}
