package com.kodilla.testing.shape;

public class Square implements Shape{

    private double lenght;
public Square(double lenght){
    this.lenght=lenght;
}

    @Override
    public String getShapeName(){
    return "Square";
}
    @Override
    public double getField(){
    return Math.pow(lenght,2);
}
}
