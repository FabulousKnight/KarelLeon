package com.shpp.p2p.cs.LIlin.assignment2;

import acm.graphics.GRect;
import com.shpp.cs.a.graphics.WindowProgram;

import java.awt.*;

/* This program draws a set of black boxes separated by
 * white gaps, centered in the window
 */
public class Assignment2Part5 extends WindowProgram {

    /* The number of rows and columns in the grid, respectively. */
    private static final int NUM_ROWS = 5;
    private static final int NUM_COLS = 6;

    /* The width and height of each box. */
    private static final double BOX_SIZE = 40;

    /* The horizontal and vertical spacing between the boxes. */
    private static final double BOX_SPACING = 10;

    /* The Width and Height of all Squares and Spacings in a columns and in a rows */
    private final double matrixWidth = NUM_COLS * BOX_SIZE + (NUM_COLS - 1) * BOX_SPACING;
    private final double matrixHeight = NUM_ROWS * BOX_SIZE + (NUM_ROWS - 1) * BOX_SPACING;

    // Draws the whole set of boxes
    public void run() {
        drawOpticalIllusion(NUM_COLS, NUM_ROWS);
    }

    // Draws every row of the set, one row at a time
    private void drawOpticalIllusion(int numCols, int numRows) {
        for (int i = 0; i < numRows; i++) {
            drawOpticalIllusionRows(i, numCols);
        }
    }

    // Draws every box in a single row, from left to right
    private void drawOpticalIllusionRows(int rowNumber, int numCols) {
        for (int i = 0; i < numCols; i++) {
            drawOpticalIllusionSquare(rowNumber, i);
        }
    }

    /* Draws a single black box at set position.
     * The set as a whole is centered in the window
     */
    private void drawOpticalIllusionSquare(int rowNumber, int colNumber) {
        GRect Square = new GRect(
                ((getWidth() - matrixWidth) / 2) + colNumber * (BOX_SIZE + BOX_SPACING),
                ((getHeight() - matrixHeight) / 2) + rowNumber * (BOX_SIZE + BOX_SPACING),
                BOX_SIZE,
                BOX_SIZE);
        Square.setFilled(true);
        Square.setFillColor(Color.black);
        add(Square);
    }
}

