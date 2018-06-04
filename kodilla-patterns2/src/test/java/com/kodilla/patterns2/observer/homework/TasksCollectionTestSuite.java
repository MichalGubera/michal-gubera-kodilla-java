package com.kodilla.patterns2.observer.homework;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TasksCollectionTestSuite {
    @Test
    public void testUpdate() {
        //Given
        Mentor johnMacLane = new Mentor("John" , "MacLane");
        Mentor jamesBond = new Mentor("James", "Bond");
        Student bartSimpson = new Student("Bart", "Simpson");
        Student jessieJames = new Student("Jessie", "James");
        TasksCollection module1BartSimpson = new Module1TasksCollection(bartSimpson);
        TasksCollection module1JessieJames = new Module1TasksCollection(jessieJames);
        TasksCollection module2BartSimpson = new Module2TasksCollection(bartSimpson);
        TasksCollection module2JessieJames = new Module2TasksCollection(jessieJames);
        module1BartSimpson.registerObserver(johnMacLane);
        module2BartSimpson.registerObserver(johnMacLane);
        module1JessieJames.registerObserver(jamesBond);
        module2JessieJames.registerObserver(jamesBond);
        //When
        module1BartSimpson.addTask("Task no1");
        module1BartSimpson.addTask("Task no2");
        module1BartSimpson.addTask("Task no3");
        module1JessieJames.addTask("Task no1");
        module1JessieJames.addTask("Task no2");
        module1JessieJames.addTask("Task no3");
        module1JessieJames.addTask("Task no4");
        module2JessieJames.addTask("Task no1");
        //Then
        assertEquals(3, johnMacLane.getUpdateCount());
        assertEquals(5, jamesBond.getUpdateCount());
    }
}
