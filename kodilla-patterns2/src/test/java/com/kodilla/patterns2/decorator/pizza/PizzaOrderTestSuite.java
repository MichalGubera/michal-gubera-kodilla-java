package com.kodilla.patterns2.decorator.pizza;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class PizzaOrderTestSuite {
    @Test
    public void testBasicPizzaOrderGetCost() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
//        System.out.println(theOrder.getCost());
        //When
        BigDecimal calculatedCost = theOrder.getCost();
        //Then
        assertEquals(new BigDecimal(15), calculatedCost);
    }

    @Test
    public void testBasicPizzaOrderGetDescription() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
//        System.out.println(theOrder.getDescription());
        //When
        String ingredients = theOrder.getDescription();
        //Then
        assertEquals("cheese + tomato sauce", ingredients);
    }

    @Test
    public void testBasicPizzaExtraCheeseOrderGetCost() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new ExtraCheeseDecorator(theOrder);
        System.out.println(theOrder.getCost());
        //When
        BigDecimal calculatedCost = theOrder.getCost();
        //Then
        assertEquals(new BigDecimal(18), calculatedCost);
    }

    @Test
    public void testBasicPizzaExtraCheeseOrderGetDescription() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new ExtraCheeseDecorator(theOrder);
        System.out.println(theOrder.getDescription());
        //When
        String ingredients = theOrder.getDescription();
        //Then
        assertEquals("cheese + tomato sauce + extra cheese", ingredients);
    }

    @Test
    public void testXLSizeWithIngerdientsOrderGetCost() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new XLSizeDecorator(theOrder);
        theOrder = new ExtraCheeseDecorator(theOrder);
        theOrder = new MushroomsDecorator(theOrder);
        theOrder = new OnionDecorator(theOrder);
        theOrder = new WhiteSauceDecorator(theOrder);
        System.out.println(theOrder.getCost());
        //When
        BigDecimal calculatedCost = theOrder.getCost();
        //Then
        assertEquals(new BigDecimal(37), calculatedCost);
    }

    @Test
    public void testXLSizeWithIngerdientsOrderGetDescription() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new XLSizeDecorator(theOrder);
        theOrder = new ExtraCheeseDecorator(theOrder);
        theOrder = new MushroomsDecorator(theOrder);
        theOrder = new OnionDecorator(theOrder);
        theOrder = new WhiteSauceDecorator(theOrder);
        System.out.println(theOrder.getDescription());
        //When
        String ingredients = theOrder.getDescription();
        //Then
        assertEquals("cheese + tomato sauce + XL + extra cheese + mushrooms + onion + white sauce", ingredients);
    }
}
