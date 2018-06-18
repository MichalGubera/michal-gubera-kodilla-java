package com.kodilla.testing.collection;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class CollectionTestSuite {
    @Before
    public void before(){
        System.out.println("Test Case: begin");
    }
    @After
    public void after(){
        System.out.println("Test Case: end");
    }
    @Test
    public void testOddNumbersExterminatorEmptyList() {
        //Given
        OddNumbersExterminator testEmptyExtetminator = new OddNumbersExterminator();
        ArrayList<Integer> emptyList = new ArrayList<>();
        ArrayList<Integer> testList = new ArrayList<>();
        //When
        ArrayList<Integer> exterminate = testEmptyExtetminator.exterminate(testList);
        //Then
        Assert.assertEquals(emptyList, exterminate);
        System.out.println("Empty list test passed: OK");
    }
    @Test
    public void testOddNumbersExterminatorNormalList() {
        //Given
        OddNumbersExterminator testNormalExtetminator = new OddNumbersExterminator();
        ArrayList<Integer> normalList = new ArrayList<>();
        for (int i=0; i<10; i++){
            if (i % 2 == 0){
                normalList.add(i);
            }
        }
        ArrayList<Integer> test2List = new ArrayList<>();
        for (int i=0; i<10; i++){
            test2List.add(i);
        }
        //When
        ArrayList<Integer> exterminateThemAll = testNormalExtetminator.exterminate(test2List);
        //Then
        Assert.assertEquals(normalList, exterminateThemAll);
        System.out.println("Odds and normal numbers in list test passed: OK");
    }
}
