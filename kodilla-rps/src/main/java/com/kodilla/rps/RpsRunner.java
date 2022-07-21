package com.kodilla.rps;

import java.util.Scanner;

public class RpsRunner {
    public static void main(String[] args) {

        boolean end = false;
        System.out.println("Welcome in Rock , Paper , Scissor Game");
        System.out.println("Type: n - Start Game Type: x - Quit");
        Engine start = new Engine();
        Moves process = new Moves();
        Scanner text = new Scanner(System.in);

        while (!end) {
            String mymove2 = process.getMyMove();
            if(mymove2.equals("n")) {
                System.out.println("Start a Game? Y/N");
                String mymove = process.getMyMove();
                switch (mymove) {
                    case "Y":
                        System.out.print("Number Wins: ");
                        try {
                            Integer key = text.nextInt();
                            start.getStart(key);
                        } catch (Exception e){
                            System.out.println("You Try crash? Type n to Start New Game or x to End Game");
                        }
                        break;
                    case "N":
                        System.out.println("End Game");
                        end = true;
                        break;
                }
            }
            if (mymove2.equals("x")){
                System.out.println("End Game ? Y/N");
                String mymove = process.getMyMove();
                switch (mymove){
                    case "Y":
                        System.out.println("End Game");
                        end = true;
                        break;
                    case "N":
                        System.out.println("Type n to start game");
                        break;

                }
            }
        }


        if (start.mySum == start.aiSum) {
            System.out.println("Tie Nobody Wins");
            System.out.println("Your Points: " + start.mySum + " Ai Points: " + start.aiSum);

        } else if (start.mySum > start.aiSum) {
            System.out.println("You win the Battle");
            System.out.println("Your Points: " + start.mySum + " Ai Points: " + start.aiSum);

        } else {
            System.out.println("Ai win the battle");
            System.out.println("Your Points: " + start.mySum + " Ai Points: " + start.aiSum);

        }
    }
}
