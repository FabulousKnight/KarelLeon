package com.shpp.p2p.cs.LIlin.assignment2;

import acm.graphics.GOval;
import acm.graphics.GRect;
import com.shpp.cs.a.graphics.WindowProgram;

import java.awt.*;

/* This program draws the "illusory contours" optical illusion.
 * Four black circles are placed in the corners of the window,
 * and a white square is drawn on top of them so that its corners
 * align exactly with the notches of the circles. This creates the
 * illusion of a white square with edges that don't actually exist.
 */
public class Assignment2Part2 extends WindowProgram {
    // не варто спиратись на ці константи в коді. чому? читайте нижче.
    public static final int APPLICATION_WIDTH = 300;
    public static final int APPLICATION_HEIGHT = 300;

    // Diameter of each of the four corner circles
    private static final int DIAMETER = 100;

    // Draws all four corner circles and the middle square on top of them
    public void run() {
        DrawLeftTopCircle();
        DrawRightTopCircle();
        DrawLeftBottomCircle();
        DrawRightBottomCircle();
        DrawMiddleSquare();
    }

    // Draws the black circle in the bottom-left corner of the window
    void DrawLeftBottomCircle() {
        GOval LeftBottomCircle = new GOval(0, getHeight() - DIAMETER, DIAMETER, DIAMETER);
        LeftBottomCircle.setColor(Color.BLACK);
        LeftBottomCircle.setFilled(true);
        LeftBottomCircle.setFillColor(Color.BLACK);
        add(LeftBottomCircle);
    }

    // Draws the black circle in the top-left corner of the window
    void DrawLeftTopCircle() {
        GOval LeftTopCircle = new GOval(0, 0, DIAMETER, DIAMETER);
        LeftTopCircle.setColor(Color.BLACK);
        LeftTopCircle.setFilled(true);
        LeftTopCircle.setFillColor(Color.BLACK);
        add(LeftTopCircle);
    }

    // Draws the black circle in the top-right corner of the window
    void DrawRightTopCircle() {
        GOval RightTopCircle = new GOval(getWidth() - DIAMETER, 0, DIAMETER, DIAMETER);
        RightTopCircle.setColor(Color.BLACK);
        RightTopCircle.setFilled(true);
        RightTopCircle.setFillColor(Color.BLACK);
        add(RightTopCircle);
    }

    // Draws the black circle in the bottom-right corner of the window
    void DrawRightBottomCircle() {
        GOval RightBottomCircle = new GOval(getWidth() - DIAMETER, getHeight() - DIAMETER, DIAMETER, DIAMETER);
        RightBottomCircle.setColor(Color.BLACK);
        RightBottomCircle.setFilled(true);
        RightBottomCircle.setFillColor(Color.BLACK);
        add(RightBottomCircle);
    }

    // Draws the white square on top of the four circles.
    void DrawMiddleSquare() {
        GRect MiddleSquare = new GRect(DIAMETER / 2, DIAMETER / 2, getWidth() - DIAMETER, getHeight() - DIAMETER);
        MiddleSquare.setColor(Color.WHITE);
        MiddleSquare.setFilled(true);
        MiddleSquare.setFillColor(Color.WHITE);
        add(MiddleSquare);
    }


}