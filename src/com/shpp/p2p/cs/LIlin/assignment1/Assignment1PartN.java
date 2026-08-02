package com.shpp.p2p.cs.LIlin.assignment1;

import com.shpp.karel.KarelTheRobot;

public class Assignment1PartN extends KarelTheRobot {
    @Override
    /* whole code for task collect newspaper in 3 methods inside run */
    public void run() throws Exception {
        movetothedoor();
        pickbeeperncomebacktohouse();
        comebacktostartwithbeeper();
    }
    /* command to make Karel move to the door */
    private void movetothedoor() throws Exception{
        move();
        move();
        turnRight();
        move();
        turnLeft();
        move();
    }
    /* command to make Karel come back to house */
    private void pickbeeperncomebacktohouse() throws Exception{
        move();
        pickBeeper();
        turnAround();
        move();
        move();
    }
    /* Command to make Karel come back to start */
    private void comebacktostartwithbeeper() throws Exception{
        move();
        move();
        turnRight();
        move();
        turnRight();
    }
    /* Command to turt karel right */
    private void turnRight() throws Exception{
        turnLeft();
        turnLeft();
        turnLeft();
    }
    /*command to make Karol move 180 */
    private void turnAround() throws Exception{
        turnLeft();
        turnLeft();
    }

}
