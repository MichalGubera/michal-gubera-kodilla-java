package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigInteger;

public class WorldTestSuite {
    @Test
    public void testGetPeopleQuantity() {
        //Given
        World world = new World();
        //When
        BigInteger quantityOfPeopleWorld = world.getPeopleQuantity();
        //Then
        BigInteger expectedQuantityOfPeopleWorld = new BigInteger("4976756249");
        Assert.assertEquals(expectedQuantityOfPeopleWorld, quantityOfPeopleWorld);
    }
}
