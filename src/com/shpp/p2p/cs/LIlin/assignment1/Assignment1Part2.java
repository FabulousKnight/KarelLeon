package com.shpp.p2p.cs.LIlin.assignment1;

import com.shpp.karel.KarelTheRobot;

public class Assignment1Part2 extends KarelTheRobot {

    public void run() throws Exception {
        fillingLineWithBeepers();
        puttingBeepersInTheLastCell();
        turnAround();
    }

    private void puttingBeepersInTheLastCell() throws Exception {
        turnAround();
        while (beepersPresent() && frontIsClear()) {
            pickBeeper();
            while (frontIsClear()) {
                move();
            }
            putBeeper();
            comebackToTheSellWithBeepers();
        }
    }

    private void comebackToTheSellWithBeepers() throws Exception {
        turnAround();
        while (beepersPresent()) {
            move();
        }
        turnAround();
        move();
    }

    private void turnAround() throws Exception {
        turnLeft();
        turnLeft();
    }

    private void fillingLineWithBeepers() throws Exception {
        while (frontIsClear()) {
            putBeeper();
            move();
        }
        putBeeper();
    }


}