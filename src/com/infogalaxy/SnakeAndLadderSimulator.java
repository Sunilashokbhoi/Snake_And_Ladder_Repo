package com.infogalaxy;

import java.util.Random;

public class SnakeAndLadderSimulator {
   //UC-1-Single Play Position
    public void playerPosition() {
        int position = 0;
        System.out.println("Player Position :" + position);
    }
  //UC-2-Use Random Number Get A Number Between 1 to 6
    public void rollDie() {
        Random random = new Random();
        int die = (int) ((Math.random()*(6-1))+1);
        System.out.println("Roll Die :" + die);
    }
    public static void main(String[] args) {
        SnakeAndLadderSimulator snake = new SnakeAndLadderSimulator();
            snake.playerPosition();
            snake.rollDie();
    }
}
