package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class LoggerTestSuite {
//    private static Logger logger;

    @BeforeClass
    public static void initialLogger(){
//        logger = new Logger();
        Logger.getInstance().log("Stefan");
    }

    @Test
    public void testGetLastLog(){
        //Given
//        logger.log("Stefan");
//        logger.log("Wiesław");
        Logger.getInstance().log("Wiesław");

        //When
//        String lastLog = logger.getLastLog();
        String lastLog = Logger.getInstance().getLastLog();

        //Then
        Assert.assertEquals("Wiesław", lastLog);
    }
}
