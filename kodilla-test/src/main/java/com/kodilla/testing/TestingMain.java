package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;

public class TestingMain {
    public static void main(String[] args) {

        Calculator calculator = new Calculator();
       Integer testadd = calculator.add(10,50);
       Integer testsub = calculator.subtract(10,50);

        if (testadd.equals(60)) {
            System.out.println("OK");
        } else {
            System.out.println("Error!");
        }
        if (testsub.equals(-40)){
            System.out.println("OK");
        } else {
            System.out.println("Error!");
        }



    }
}