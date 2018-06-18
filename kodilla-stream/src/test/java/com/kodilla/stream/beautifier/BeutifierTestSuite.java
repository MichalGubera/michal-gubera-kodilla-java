package com.kodilla.stream.beautifier;

import org.junit.Assert;
import org.junit.Test;

public class BeutifierTestSuite {
    @Test
    public void testPoemBeautifierAbc() {
        //Given
        PoemBeautifier poemBeautifier = new PoemBeautifier();
        String expectedText = "ABC welcome to my pretty world ABC";
        //When
        String result = poemBeautifier.beautify("welcome to my pretty world", (text) -> "ABC " + text + " ABC");
        //Then
        Assert.assertEquals(expectedText, result);

    }

    @Test
    public void testPoemBeautifierUpperCase() {
        //Given
        PoemBeautifier poemBeautifier = new PoemBeautifier();
        String expectedText = "WELCOME TO MY PRETTY WORLD";
        //When
        String result = poemBeautifier.beautify("welcome to my pretty world", (text) -> text.toUpperCase());
        //Then
        Assert.assertEquals(expectedText, result);

    }
}
