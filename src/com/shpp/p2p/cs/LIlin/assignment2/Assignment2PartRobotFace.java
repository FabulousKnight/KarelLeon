package com.shpp.p2p.cs.LIlin.assignment2;

import acm.graphics.GOval;
import acm.graphics.GRect;
import com.shpp.cs.a.graphics.WindowProgram;

import java.awt.*;

/* This program draws a Robot Face, where face is centered in the middle of the Window, eyes located at 1/4 of Height
* and Width of the Face, and mouth located in the middle of Width and 1/4 of bottom height.
 */
public class Assignment2PartRobotFace extends WindowProgram {

    private final static int HEAD_WIDTH = 400;
    private final static int HEAD_HEIGHT = 300;
    private final static int EYE_DIAMETER = 50;
    private final static int MOUTH_WIDTH = 200;
    private final static int MOUTH_HEIGHT = 50;

    //Command that draws whole Face with eyes and mouth
    public void run() {
        drawRobotFace();
        drawRobotEyes();
        drawRobotMouth();
    }

    // command that draws a Centred Face
    private void drawRobotFace() {
        GRect RobotFace = new GRect(
                getWidth() / 2 - HEAD_WIDTH / 2,
                getHeight() / 2 - HEAD_HEIGHT / 2,
                HEAD_WIDTH,
                HEAD_HEIGHT);
        RobotFace.setFilled(true);
        RobotFace.setFillColor(Color.BLACK);
        add(RobotFace);
    }

    //Command that draws a left and right eye both located at 1/4 of height and width of each side of the face
    private void drawRobotEyes() {
        GOval LeftEye = new GOval(
                getWidth() / 2 - HEAD_WIDTH / 4 - EYE_DIAMETER /2,
                getHeight() / 2 - HEAD_HEIGHT / 3,
                EYE_DIAMETER,
                EYE_DIAMETER);
        LeftEye.setFilled(true);
        LeftEye.setFillColor(Color.green);
        add(LeftEye);

        GOval RightEye = new GOval(
                getWidth() / 2 + HEAD_WIDTH / 4 - EYE_DIAMETER /2,
                getHeight() / 2 - HEAD_HEIGHT / 3,
                EYE_DIAMETER,
                EYE_DIAMETER);
        RightEye.setFilled(true);
        RightEye.setFillColor(Color.green);
        add(RightEye);
    }

    // Command that draws robot mouth that centred in the middle of the face and on 1/4 of the bottom Height
    private void drawRobotMouth() {
        GRect RobotMouth = new GRect(
                getWidth() / 2 - MOUTH_WIDTH / 2,
                getHeight() / 2 + HEAD_HEIGHT / 4,
                MOUTH_WIDTH,
                MOUTH_HEIGHT);
        RobotMouth.setFilled(true);
        RobotMouth.setFillColor(Color.BLUE);
        add(RobotMouth);
    }


}
