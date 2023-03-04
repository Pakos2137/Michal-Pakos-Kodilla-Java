package com.kodilla.patterns.strategy.social;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTestSuite {
    @Test
    public void testDefaultSharingStrategies() {
        User michal = new ZGeneration("Michal");
        User zbyszek = new YGeneration("Zybszek");
        User janusz = new Millenials("Janusz");

        String michalUse = michal.sharePost();
        System.out.println("Michal Use " + michalUse);
        String zbyszekUse = zbyszek.sharePost();
        System.out.println("Zbyszek use " + zbyszekUse);
        String januszUse = janusz.sharePost();
        System.out.println("Janusz use " + januszUse);

        assertEquals("Snapchat",michalUse);
        assertEquals("Facebook",zbyszekUse);
        assertEquals("Twitter",januszUse);
    }
    @Test
    public void testIndividualSharingStrategy() {
        User brajan = new Millenials("Brajan");

        String brajanUse = brajan.sharePost();
        System.out.println("Brajan Use" + brajanUse);
        brajan.setSocialPublisher(new TwitterPublisher());
        brajanUse = brajan.sharePost();
        System.out.println(brajanUse);

        assertEquals("Twitter",brajanUse);

    }
}
