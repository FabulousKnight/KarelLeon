package com.shpp.p2p.cs.LIlin.assignment1;

import com.shpp.karel.KarelTheRobot;

public class Assignment1Part3 extends KarelTheRobot {

    public void run() throws Exception {
        fillLineFromZeroAndComebackWithTurn();
        while (frontIsClear()) {
            moveToTheNextLine();
            fillLineFromOneAndComebackWithTurn();
            if (frontIsClear()) {
                moveToTheNextLine();
                fillLineFromZeroAndComebackWithTurn();
            }
        }
    }

    // Karel moving to the next line and turning to the right
    private void moveToTheNextLine() throws Exception {
        move();
        turnRight();
    }

    // Karel filling the line with beepers from tile one, then moving back to the line start and turning to the right
    private void fillLineFromOneAndComebackWithTurn() throws Exception {
        fillLineFromOne();
        comeBackAndTurn();
    }

    // Karel filling the line with beepers from tile zero, then moving back to the line start and turning to the right
    private void fillLineFromZeroAndComebackWithTurn() throws Exception {
        fillLineFromZero();
        comeBackAndTurn();
    }

    // After Karel filled the line with beepers he turns 180 degrees and moving back to the start of the line
    private void comeBackAndTurn() throws Exception {
        turnAround();
        while (frontIsClear()) {
            move();
        }
        turnRight();
    }

    // Karel turning 90 degrees to the right from his primary position
    private void turnRight() throws Exception {
        turnLeft();
        turnLeft();
        turnLeft();
    }

    // Karel turning 180 degrees to the right from his primary position
    private void turnAround() throws Exception {
        turnLeft();
        turnLeft();
    }

    // Karel filling the line with beepers from tile one
    private void fillLineFromOne() throws Exception {
        while (frontIsClear()) {
            move();
            putBeeper();
            if (frontIsClear()) {
                move();
            }
        }
    }

    // Karel filling the line with beepers from tile zero
    private void fillLineFromZero() throws Exception {
        if (frontIsBlocked()) {
            putBeeper();
        } else {
            putBeeper();
            checkingNextStepsAndPuttingBeeperInLinesFromZero();
        }
    }

    // This is checker for Karel, if he can move forward and continue filling lines from zero with beepers
    private void checkingNextStepsAndPuttingBeeperInLinesFromZero() throws Exception {
        while (frontIsClear()) {
            move();
            if (frontIsClear()) {
                move();
                putBeeper();
            }
        }
    }
}