package com.kodilla.patterns.singleton;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoggerTestSuite {
    private static Logger logger;

    @BeforeAll
    public static void startup(){
        logger = Logger.ENUMINSTATCE;
        logger.log("LogTest");

    }
    @Test
    public  void testgetLastLog(){
        //Given
        //When
        String result = logger.getLastLog();
        //Then
        assertEquals("LogTest", result);

    }

}
