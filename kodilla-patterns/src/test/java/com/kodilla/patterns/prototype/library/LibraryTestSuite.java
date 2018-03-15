package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.util.stream.IntStream;

public class LibraryTestSuite {
    @Test
    public void testGetBooks(){
        //given
        //creating the library
        Library handyLibrary = new Library("Handy Library");
        IntStream.iterate(1, n -> n + 1)
                .limit(10)
                .forEach(n -> handyLibrary.getBooks().add(new Book("Dzieła Zebrane, t." + n, "C.K. Norwid", LocalDate.now().minusYears(35).plusYears(n))));

        //making shallow clone of object library
        Library clonedHandyLibrary = null;
        try {
            clonedHandyLibrary = handyLibrary.shallowCopy();
            clonedHandyLibrary.setName("Handy Library 2");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //making a deep copy of a object library
        Library deepClonedHandyLibrary = null;
        try {
            deepClonedHandyLibrary = handyLibrary.deepCopy();
            deepClonedHandyLibrary.setName("Handy Library 3");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //When

        //Then
        System.out.println(handyLibrary);
        System.out.println(clonedHandyLibrary);
        System.out.println(deepClonedHandyLibrary);
        Assert.assertEquals(10, handyLibrary.getBooks().size());
        Assert.assertEquals(10, clonedHandyLibrary.getBooks().size());
        Assert.assertEquals(10, deepClonedHandyLibrary.getBooks().size());
        Assert.assertEquals(clonedHandyLibrary.getBooks(), handyLibrary.getBooks());
    }
}
