package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

public class BigmacTestSuite {
    @Test
    public void testBigmacNew() {
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .roll("sesame")
                .burgers(2)
                .sauce("1000 islands")
                .ingredient("lettuce")
                .ingredient("onion")
                .ingredient("cucumber")
                .ingredient("beacon")
                .ingredient("chili")
                .ingredient("mushrooms")
                .ingredient("shrimps")
                .ingredient("cheese")
                .build();
        System.out.println(bigmac);
        //When
        int howManyBurgers = bigmac.getBurgers();
        int howManyIngredients = bigmac.getIngredients().size();
        //Then
        Assert.assertEquals(2, howManyBurgers);
        Assert.assertEquals(8, howManyIngredients);
    }
}
