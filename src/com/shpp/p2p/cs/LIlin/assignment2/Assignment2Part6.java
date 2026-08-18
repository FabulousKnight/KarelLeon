package com.shpp.p2p.cs.LIlin.assignment2;

import acm.graphics.GOval;
import com.shpp.cs.a.graphics.WindowProgram;

import java.awt.*;

/* This program draws a caterpillar made of overlapping green circles
 * with a red outline. The circles alternate between a higher and a
 * lower vertical position. The number of segments can be easily changed
 * via the CIRCLES_NUMBER constant.
 */
public class Assignment2Part6 extends WindowProgram {

    // Diameter of each circle (caterpillar segment)
    private static final int DIAMETER = 100;

    // Number of circles that make up the caterpillar
    private static final int CIRCLES_NUMBER = 8;

    // Draws all the circles that make up the caterpillar, one by one, left to right
    public void run() {
        for (int i = 0; i < CIRCLES_NUMBER; i++)
            DrawCircles(i);
    }

    /* Draws circle number i of the caterpillar.
     * Circles are spaced apart horizontally so that each
     * new circle overlaps the previous one, and they alternate between
     * two vertical positions to create the wavy caterpillar shape.
     */
    private void DrawCircles(int i) {
        if (i % 2 == 0) {
            GOval Circle = new GOval(i * (DIAMETER / 2), getHeight() / 2 - DIAMETER / 2, DIAMETER, DIAMETER);
            Circle.setColor(Color.RED);
            Circle.setFilled(true);
            Circle.setFillColor(Color.GREEN);
            add(Circle);
        } else {
            GOval Circle = new GOval(i * (DIAMETER / 2), getHeight() / 2 - (DIAMETER - (DIAMETER / 4)), DIAMETER, DIAMETER);
            Circle.setColor(Color.RED);
            Circle.setFilled(true);
            Circle.setFillColor(Color.GREEN);
            add(Circle);
        }
    }


}
