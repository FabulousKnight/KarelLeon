package com.shpp.p2p.cs.LIlin.assignment1;

import com.shpp.karel.KarelTheRobot;

public class Assignment1Part2 extends KarelTheRobot {

    public void run() throws Exception {
        settingBeepersOnTheSides();
        while (noBeepersPresent()) {
            movingBeepersOneCellToTheCenter();
            move();
        }
        if (beepersPresent()) {
            pickBeeper();
        }


    }

    /* Karel moving from empty cell to the endpoint beeper, picking it up
     * and moving beeper 1 cell to the center of the line
     */
    private void movingBeepersOneCellToTheCenter() throws Exception {
        while (noBeepersPresent()) {
            move();
        }
        pickBeeper();
        turnAround();
        move();
        putBeeper();


    }

    // Karel putting beepers to the sides of the line to measure endpoints
    private void settingBeepersOnTheSides() throws Exception {
        putBeeper();
        while (frontIsClear()) {
            move();
        }
        putBeeper();
        turnAround();
        move();
    }

    //Karel turning 180 degrees from his primary position
    private void turnAround() throws Exception {
        turnLeft();
        turnLeft();
    }

}