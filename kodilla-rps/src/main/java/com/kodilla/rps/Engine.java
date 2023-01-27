package com.kodilla.rps;

public class Engine {
    static int mySum;
    static int aiSum;

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public void getStart(int a) {
        Moves process = new Moves();
        int round = a;

        int rmystats = 0;
        int raistats = 0;
        int nrround = 0;

        boolean end = false;


        while (!end) {

            nrround++;


            System.out.println("Round NR: " + nrround);
            System.out.println("Please Enter 1 - Rock , 2 - Paper , 3 - Scissors");

            String mymove = process.getMyMove();
            String aimove = process.getAiMove();


            if (mymove.equals(aimove)) {
                System.out.println("Ai Choose: " + aimove + " You Choose: " + mymove);
                System.out.println("Tie");

                mySum += 1;
                aiSum += 1;
                rmystats += 1;
                raistats += 1;

                System.out.println("Actual Stats You: " + rmystats + " Ai: " + raistats);
                System.out.println();

            } else if (mymove.equals("1")) {
                if (aimove.equals("2")) {
                    System.out.println("Ai Choose: " + aimove + " - Paper " + " You Choose: " + mymove + " -Rock");
                    System.out.println("Paper beat Rock Ai Wins");


                    raistats += 1;
                    aiSum += 1;

                    System.out.println("Actual Stats You: " + rmystats + " Ai: " + raistats);
                    System.out.println();
                } else if (aimove.equals("3")) {
                    System.out.println("Ai Choose: " + aimove + " - Scissors" + " You Choose: " + mymove + " -Rock");
                    System.out.println("Rock beat Scissors You Win");


                    rmystats += 1;
                    mySum += 1;

                    System.out.println("Actual Stats You: " + rmystats + " Ai: " + raistats);
                    System.out.println();
                }
            } else if (mymove.equals("2")) {
                if (aimove.equals("1")) {
                    System.out.println("Ai Choose: " + aimove + " -Rock" + " You Choose: " + mymove + " Paper");
                    System.out.println("Paper beat Rock You Win");

                    rmystats += 1;
                    mySum += 1;

                    System.out.println("Actual Stats You: " + rmystats + " Ai: " + raistats);
                    System.out.println();
                } else if (aimove.equals("3")) {
                    System.out.println("Ai Choose: " + aimove + " Scissors" + " You Choose: " + mymove + " Paper");
                    System.out.println("Scissors beat Paper Ai Win");


                    raistats += 1;
                    aiSum += 1;

                    System.out.println("Actual Stats You: " + rmystats + " Ai: " + raistats);
                    System.out.println();
                }
            } else if (mymove.equals("3")) {
                if (aimove.equals("2")) {
                    System.out.println("Ai Choose: " + aimove + " -Paper" + " You Choose: " + mymove + " -Scissors");
                    System.out.println("Scissors beat Paper You Win");


                    rmystats += 1;
                    mySum += 1;

                    System.out.println("Actual Stats You: " + rmystats + " Ai: " + raistats);
                    System.out.println();
                } else if (aimove.equals("1")) {
                    System.out.println("Ai Choose: " + aimove + " -Rock " + " You Choose: " + mymove + " - Scissors");
                    System.out.println("Rock beat Scissors Ai Win");


                    raistats += 1;
                    aiSum += 1;

                    System.out.println("Actual Stats You: " + rmystats + " Ai: " + raistats);
                    System.out.println();
                }

            }


            if (raistats == round || rmystats == round) {
                System.out.println("Round Over");
                System.out.println("Type n start New Game with actual stats");
                System.out.println("Type x quit");
                System.out.println("Actual Stats You: " + rmystats + " Ai: " + raistats);
                end = true;
            }
        }
    }
}











