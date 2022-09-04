package com.kodilla.spring.calculator;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class CalculatorTestSuite {
@Autowired
private Calculator calculator;
@Test
public void testCalculations(){
    //Given
    //When
    double addResult = calculator.add(10,10);
    double subResult = calculator.sub(10,5);
    double divResult = calculator.div(10,5);
    double mulResult = calculator.mul(10,5);

    //Then
    assertEquals(20,addResult);
    assertEquals(5,subResult);
    assertEquals(2,divResult);
    assertEquals(50,mulResult);
}

}