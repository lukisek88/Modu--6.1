package com.kodilla.testing.shape;


import org.junit.jupiter.api.*;



@Nested
@DisplayName("Test MY Figures")
public class ShapeCollectorTestSuite {
    @DisplayName("Test add Figure check size")
    @Test
    public void testAddFigure(){
        //Given
        ShapeCollector shapecollector = new ShapeCollector();
        Shape circle = new Circle(10.8);
        Shape square = new Square(10);
        Shape triangle = new Triangle(15,10,5);
        //When
        shapecollector.addFigure(circle);
        shapecollector.addFigure(square);
        shapecollector.addFigure(triangle);
        //Then
        Assertions.assertEquals(3, shapecollector.getShapeCollection().size());


    }
    @DisplayName("Test RemoveFigure")
    @Test
    public void testRemoveFigure(){
        //Given
        ShapeCollector shapecollector = new ShapeCollector();
        Shape circle = new Circle(10.8);
        Shape square = new Square(10);
        Shape triangle = new Triangle(15,10,5);
        //When
        shapecollector.removeFigure(circle);
        shapecollector.removeFigure(square);
        shapecollector.removeFigure(triangle);
        //Then
        Assertions.assertEquals(0, shapecollector.getShapeCollection().size());

    }
    @DisplayName("Test GetFigure")
    @Test
    public void testGetFigure(){
        //Given
        ShapeCollector shapecollector = new ShapeCollector();
        Shape circle = new Circle(10.8);
        Shape square = new Square(10);
        Shape triangle = new Triangle(15,10,5);
        shapecollector.addFigure(circle);
        shapecollector.addFigure(square);
        shapecollector.addFigure(triangle);
        //When
        Shape circleresult= shapecollector.getFigure(0);
        Shape squareresult= shapecollector.getFigure(1);
        Shape triangleresult= shapecollector.getFigure(2);
        //Then
        Assertions.assertEquals(circle, circleresult);
        Assertions.assertEquals(square, squareresult);
        Assertions.assertEquals(triangle, triangleresult);

    }
    @DisplayName("Test ShowFigures")
    @Test
    public void testshowFigure(){
        //Given
        ShapeCollector shapecollector = new ShapeCollector();
        Shape circle = new Circle(1);
        Shape square = new Square(2);
        Shape triangle = new Triangle(15,10,5);
        shapecollector.addFigure(circle);
        shapecollector.addFigure(square);
        shapecollector.addFigure(triangle);

     String expected ="Circle 3,14 Square 4,00 Triangle 30,00 ";
        //When
        String resultlist = shapecollector.showFigures();
        //Then
        Assertions.assertEquals(expected, resultlist);
    }
    }

