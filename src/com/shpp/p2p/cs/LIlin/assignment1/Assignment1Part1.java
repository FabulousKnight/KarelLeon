package com.shpp.p2p.cs.LIlin.assignment1;

import com.shpp.karel.KarelTheRobot;

public class Assignment1Part1 extends KarelTheRobot {

    public void run() throws Exception {
        while (frontIsClear()) {
            buildColumnNComeback();
            moveToTheNextColumn();
        }
        if (frontIsBlocked()) {
            buildColumnNComeback();
        }

    }

    /* Karel building column, turning around, moving to the ground, and turning to face the
    ground of the next column
     */
    private void buildColumnNComeback() throws Exception {
        buildColumn();
        turnAroundAndComeback();
    }

    /* After Karel built column he turns 180 and moving to the ground
    after that he turns to face the ground of the next column
     */
    private void turnAroundAndComeback() throws Exception {
        turnAround();
        while (frontIsClear()) {
            move();
        }
        turnLeft();

    }

    /* Karel turning 180 degrees */
    private void turnAround() throws Exception {
        turnLeft();
        turnLeft();
    }

    /* Karel turning to the left side and building column from the ground to the top point
     * until he will reach the wall, also checking last top point for beepers
     */
    private void buildColumn() throws Exception {
        turnLeft();
        while (frontIsClear()) {
            checkForBeepers();
        }
        checkLastTile();
    }

    // Karel checking last tile for beepers, if he needs to put one
    private void checkLastTile() throws Exception {
        if (noBeepersPresent()) {
            putBeeper();
        }
    }

    // Karel checking for beepers beneath him to understand if he needs to put one
    private void checkForBeepers() throws Exception {
        if (noBeepersPresent()) {
            putBeeper();
            move();
        } else {
            move();
        }
    }

    // Karel moving 4 tiles forward to reach the ground of next column
    private void moveToTheNextColumn() throws Exception {
        for (int i = 0; i < 4; i++) {
            move();
        }
    }
}
