package com.kodilla.patterns.strategy.social;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTestSuite {

    @Test
    public void testDefaultSharingStrategies() {
        //Given
        Millenials millenials = new Millenials("M John");
        YGeneration yGeneration = new YGeneration("Y Mike");
        ZGeneration zGeneration = new ZGeneration("Z Madlyn");

        //When
        String mJohnShareOn = millenials.sharePost();
        String yMikeShareOn = yGeneration.sharePost();
        String zMadlynShareOn = zGeneration.sharePost();

        //Then
        assertEquals("Facebook", mJohnShareOn);
        assertEquals("Twitter", yMikeShareOn);
        assertEquals("Snapchat", zMadlynShareOn);
    }

    @Test
    public void testIndibidualSharingStrategy() {
        //Given
        Millenials millenials = new Millenials("M john");

        //When
        String mJohnShareOn = millenials.sharePost();
        millenials.setSocialPublisher(new SnapchatPublisher());
        mJohnShareOn = millenials.sharePost();

        //Then
        assertEquals("Snapchat", mJohnShareOn);
    }
}
