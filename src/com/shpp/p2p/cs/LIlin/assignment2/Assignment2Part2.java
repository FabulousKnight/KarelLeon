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
    private static final int RADIUS = DIAMETER / 2;

    // Draws all four corner circles and the middle square on top of them
    public void run() {
        DrawCircles(0, 0);
        DrawCircles(0, getHeight()-DIAMETER);
        DrawCircles(getWidth()-DIAMETER, 0);
        DrawCircles(getWidth() - DIAMETER, getHeight()-DIAMETER);
        DrawMiddleSquare();
    }

    void DrawCircles(double width, double height) {
        GOval LeftBottomCircle = new GOval(width, height, DIAMETER, DIAMETER);
        LeftBottomCircle.setColor(Color.BLACK);
        LeftBottomCircle.setFilled(true);
        LeftBottomCircle.setFillColor(Color.BLACK);
        add(LeftBottomCircle);
    }

    // Draws the white square on top of the four circles.
    void DrawMiddleSquare() {
        GRect MiddleSquare = new GRect(RADIUS, RADIUS, getWidth() - DIAMETER, getHeight() - DIAMETER);
        MiddleSquare.setColor(Color.WHITE);
        MiddleSquare.setFilled(true);
        MiddleSquare.setFillColor(Color.WHITE);
        add(MiddleSquare);
    }


}