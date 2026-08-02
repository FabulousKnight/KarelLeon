package com.shpp.p2p.cs.LIlin.assignment1;

import com.shpp.karel.KarelTheRobot;

public class Assignment1Part2 extends KarelTheRobot {

    public void run() throws Exception {
        puttingBeepersDiagonally();
    }

    private void puttingBeepersDiagonally() throws Exception {
        putBeeper();
        while(frontIsClear()){
            turnLeft();
            move();
            turnRight();
            move();
            putBeeper();
        }
    }

    private void turnRight() throws Exception {
        turnLeft();
        turnLeft();
        turnLeft();
    }
}