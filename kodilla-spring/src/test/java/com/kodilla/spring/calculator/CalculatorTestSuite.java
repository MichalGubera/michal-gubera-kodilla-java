package com.kodilla.spring.calculator;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CalculatorTestSuite {
    @Test
    public void testCalculations(){
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);
        //When
        double add = calculator.add(6.0,3.0);
        double sub = calculator.sub(6.0,3.0);
        double mul = calculator.mul(6.0,3.0);
        double div = calculator.div(6.0,3.0);
        //Then
        Assert.assertEquals(9, add,0);
        Assert.assertEquals(3, sub,0);
        Assert.assertEquals(18, mul,0);
        Assert.assertEquals(2, div,0);
    }
}
