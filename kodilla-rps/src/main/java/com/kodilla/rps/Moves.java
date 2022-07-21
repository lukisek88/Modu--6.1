package com.kodilla.rps;

import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;

public class Moves {
    HashSet<String> correctCharSet = new HashSet<String>();

    public Moves() {
        correctCharSet.add("1");
        correctCharSet.add("2");
        correctCharSet.add("3");
        correctCharSet.add("x");
        correctCharSet.add("n");
        correctCharSet.add("Y");
        correctCharSet.add("N");


    }

    public String getAiMove() {
        String[] rps = {"1", "2", "3"};
        String aiMove = rps[new Random().nextInt(rps.length)];
        return aiMove;
    }

    public String getMyMove() {

        Scanner in = new Scanner(System.in);
        String myMove ;
        do{
            myMove = in.nextLine();
        }while(!correctCharSet.contains(myMove));
        return myMove;

    }
}