package com.kodilla.testing.shape;

public class Triangle implements Shape{
    private double lenghtA;
    private double lenghtB;
    private double lenghtC;

    public Triangle(double lenghtA, double lenghtB, double lenghtC) {
        this.lenghtA = lenghtA;
        this.lenghtB = lenghtB;
        this.lenghtC = lenghtC;
    }
    @Override
    public String getShapeName(){
        return "Triangle";
    }
    @Override
    public double getField() {

            return lenghtA+lenghtB+lenghtC;
        }

}
