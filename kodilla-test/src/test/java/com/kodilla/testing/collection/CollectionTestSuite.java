package com.kodilla.testing.collection;



import org.junit.jupiter.api.*;


import java.util.*;

public class CollectionTestSuite {
    @BeforeEach
    public void before() {
        System.out.println("Test Case: begin");
    }

    @AfterEach
    public void after() {
        System.out.println("Test Case: end");
    }

    @BeforeAll
    public static void beforeAll() {
        System.out.println("Test Suite: begin");
    }

    @AfterAll
    public static void afterAll() {
        System.out.println("Test Suite: end");
    }


    @DisplayName("Test Empty List")
    @Test
    public void testOddNumbersExterminatorEmptyList(){
        //Given
        OddNumbersExterminator oNE = new OddNumbersExterminator();
        ArrayList<Integer> emptyList = new ArrayList<>();
        //When
        List<Integer> resultList = oNE.exterminate(emptyList);
        System.out.println("TEST EMPTY LIST");
        //Then
        Assertions.assertEquals(emptyList, resultList);
    }
    @DisplayName("Test Odd numbers")
    @Test
    public void testOddNumbersExterminatorNormalList(){
        //Given
        OddNumbersExterminator oNE = new OddNumbersExterminator();
        ArrayList<Integer> numList = new ArrayList<>();
        numList.add(10);
        numList.add(10);
        numList.add(15);
        numList.add(17);
        numList.add(6);
        numList.add(2);
        numList.add(13);
        numList.add(18);

        ArrayList<Integer>expectedResultList = new ArrayList<>();
        expectedResultList.add(10);
        expectedResultList.add(10);
        expectedResultList.add(6);
        expectedResultList.add(2);
        expectedResultList.add(18);
        //When
        List<Integer> resultList = oNE.exterminate(numList);
        System.out.println("TEST NUM LIST");
        //Then
        Assertions.assertEquals(expectedResultList, resultList);
    }

}
