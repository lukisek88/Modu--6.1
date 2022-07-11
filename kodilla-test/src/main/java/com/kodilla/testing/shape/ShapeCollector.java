package com.kodilla.testing.shape;

import java.util.*;


public class ShapeCollector {

    private List<Shape> shapeList = new ArrayList<>();

    public List<Shape> getShapeCollection() {
        return shapeList;
    }

    public void addFigure(Shape shape){
        shapeList.add(shape);
    }

    public boolean removeFigure(Shape shape){
        return shapeList.remove(shape);
    }

    public Shape getFigure(int n){
        if(n >= 0 &&  n < shapeList.size()){
            return shapeList.get(n);
        } else {
            return null;
        }

    }

    public String showFigures(){
        String shapeDiscription ="";
         for(Shape shape:shapeList){
          shapeDiscription +=shape.getShapeName() +" "+ String.format("%.2f", shape.getField())+" ";


        }

        return shapeDiscription;


    }

}
