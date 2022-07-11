package com.kodilla.testing.collection;
import java.util.*;

public class OddNumbersExterminator {

    public List<Integer> exterminate(List<Integer> numbers){
     ArrayList<Integer>numberlist=new ArrayList<>();
     for (int num : numbers){
         if(num%2==0){
             numberlist.add(num);
         }

     }
     return numberlist;
    }
}
