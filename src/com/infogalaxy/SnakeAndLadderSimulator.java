package com.infogalaxy;

import java.util.Random;

public class SnakeAndLadderSimulator {
   //Position of Player
   int position = 0;
   //Define Constant For Option
    final int NO_PLAY = 1;
    final int LADDER = 2 ;
    final int SNAKE = 3 ;
    Random random = new Random();
    //Showing The Player Cerrent Position
    public void showPosition() {
        System.out.println("Player Position :" + position);
    }
  //-2-Rolling The Die To Position
    public void rollDie() {

        while(position!= 100) {
            int dieNo = (int) ((Math.random() *( 7 - 1)) + 1);
            System.out.println("Roll Die :" + dieNo);

            //UC-3-Checking For Options to play
             int option = (int) ((Math.random()*(4-1))+1);
            System.out.println("Die No. :" + option);
            switch (option) {
                case NO_PLAY:
                    System.out.println("NO PLAY Arrived. Stay on Same Position");
                    break;
                case LADDER:
                    System.out.println("HIRRAY !!! you get Ladder");
                    position = position + dieNo;
                    break;
                case SNAKE:
                    System.out.println("OPP !!! you get Snake");
                    position = position - dieNo ;
                    break;

            }
        }
    }
    public static void main(String[] args) {
        //Creating Player1 Object
        SnakeAndLadderSimulator playe1 = new SnakeAndLadderSimulator();
        //Showing Player1 position
            playe1.showPosition();
            //Rolling The Die
            playe1.rollDie();
            playe1.showPosition();
    }
}
