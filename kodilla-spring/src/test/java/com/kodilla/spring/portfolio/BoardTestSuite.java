package com.kodilla.spring.portfolio;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
public class BoardTestSuite {
    @Test
    public void testTaskAdd(){
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);
        //When
        board.addToDoListTask("do something");
        board.addDoneListTask("do something useful");
        board.addInProgressListTask("say something");
        board.addDoneListTask("eat something");
        boolean resultToDoTask = board.getToDoList().getTask().contains("do something useful");
        boolean resultInProgressTask = board.getInProgressList().getTask().contains("say something");
        boolean resultDoneTask = board.getDoneList().getTask().contains("eat something");
        //Then
        Assert.assertEquals(resultToDoTask, true);
        Assert.assertEquals(resultInProgressTask, true);
        Assert.assertEquals(resultDoneTask,true);
    }
}
