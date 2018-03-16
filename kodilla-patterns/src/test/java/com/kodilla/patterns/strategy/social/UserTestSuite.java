package com.kodilla.patterns.strategy.social;

import com.kodilla.patterns.strategy.social.publishers.TwitterPublisher;
import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {
    @Test
    public void testDefaultSharingStrategies(){
        //Given
        User mark = new Millenials("Mark Zuckerberg");
        User emma = new YGeneration("Emma Watson ");
        User lily = new ZGeneration("Lily-Rose Depp");

        //When
        String markShouldUse = mark.sharePost();
        System.out.println("Mark should: " + markShouldUse);
        String emmaShouldUse = emma.sharePost();
        System.out.println("Emma should: " + emmaShouldUse);
        String lilyShouldUse = lily.sharePost();
        System.out.println("Lilly should: " + lilyShouldUse);

        //Then
        Assert.assertEquals("use Facebook", markShouldUse);
        Assert.assertEquals("use Snapchat", emmaShouldUse);
        Assert.assertEquals("use Twitter", lilyShouldUse);

    }

    @Test
    public void testIndividualSharingStrategy(){
        //Given
        User mark = new Millenials("Mark Zuckerberg");

        //When
        String markShouldUse = mark.sharePost();
        System.out.println("Mark should: " + markShouldUse);
        mark.setSocialPublishingStrategy(new TwitterPublisher());
        markShouldUse = mark.sharePost();
        System.out.println("Mark now should: " + markShouldUse);

        //Then
        Assert.assertEquals("use Twitter", markShouldUse);
    }
}
