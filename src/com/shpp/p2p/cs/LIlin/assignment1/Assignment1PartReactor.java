package com.shpp.p2p.cs.LIlin.assignment1;

import com.shpp.karel.KarelTheRobot;

public class Assignment1PartReactor extends KarelTheRobot {

    public void run() throws Exception {
        while (frontIsClear()) {
            checkBothSidesOfTheReactor();
            move();
        }
        if (frontIsBlocked()) {
            checkBothSidesOfTheReactor();
        }
    }

    // Karel checking both sides of the Reactor for any beepers present
    private void checkBothSidesOfTheReactor() throws Exception {
        checkLeftSideOfTheReactor();
        checkRightSideOfTheReactor();
    }

    /* Karel turning to the right side from the input position, then if front is clear
     * moving to the cell and collecting all beepers on the ground, after cleaned,
     * turning around, moving back to the center and facing East
     */
    private void checkRightSideOfTheReactor() throws Exception {
        turnRight();
        if (frontIsClear()) {
            comingToSellAndCheckForBeepers();
            turnAround();
            move();
            turnRight();
        } else {
            turnLeft();
        }
    }

    /* Karel turning to the left side from the input position, then if front is clear
     * moving to the cell and collecting all beepers on the ground, after cleaned,
     * turning around, moving back to the center and facing East
     */
    private void checkLeftSideOfTheReactor() throws Exception {
        turnLeft();
        if (frontIsClear()) {
            comingToSellAndCheckForBeepers();
            turnAround();
            move();
            turnLeft();
        } else {
            turnRight();
        }

    }

    /* Karel checking the sell for any Beepers present, and collecting them while cell
     * will not be clean of Beepers
     */
    private void comingToSellAndCheckForBeepers() throws Exception {
        if (frontIsClear()) {
            move();
        }
        if (beepersPresent()) {
            while (beepersPresent()) {
                pickBeeper();
            }
        }
    }

    // Karel turning 90 degrees to the right from the input position
    private void turnRight() throws Exception {
        turnLeft();
        turnLeft();
        turnLeft();
    }

    // Karel turning 180 degrees to the right from the input position.
    private void turnAround() throws Exception {
        turnLeft();
        turnLeft();
    }
}