package com.shpp.p2p.cs.LIlin.assignment2;

import acm.graphics.GLabel;
import acm.graphics.GRect;
import com.shpp.cs.a.graphics.WindowProgram;

import java.awt.*;

/* This program draws the flag of Nigeria: three equal vertical stripes
 * centered in the window, with a thin black outline around the whole flag
 * and a "Flag of Nigeria" label in the bottom-right corner of the window.
 */
public class Assignment2Part4 extends WindowProgram {

    private static final int LINE_WIDTH = 150;
    private static final int LINE_HEIGHT = 300;

    // Total width of the flag: three lines side by side
    private static final int FLAG_WIDTH = LINE_WIDTH * 3;

    // Custom green color used for the flag lines
    private static final Color EmeraldGreen = new Color(0, 135, 81);

    // Draws the three lines, the outline box behind them, and the flag name
    public void run() {
        DrawLines(getWidth() / 2 - FLAG_WIDTH / 2, EmeraldGreen);
        DrawLines(getWidth() / 2 - LINE_WIDTH / 2, Color.WHITE);
        DrawLines(getWidth() / 2 + LINE_WIDTH / 2, EmeraldGreen);
        DrawFlagBox();
        PrintCountryFlagName();

    }

    // Draws an unfilled black rectangle around the whole flag, used as its border
    void DrawFlagBox() {
        GRect FlagBox = new GRect(getWidth() / 2 - FLAG_WIDTH / 2, getHeight() / 2 - LINE_HEIGHT / 2, FLAG_WIDTH, LINE_HEIGHT);
        FlagBox.setColor(Color.BLACK);
        add(FlagBox);
    }

    void DrawLines(double lineOffsetWidth, Color lineColor) {
        GRect Lines = new GRect(lineOffsetWidth, getHeight() / 2 - LINE_HEIGHT / 2, LINE_WIDTH, LINE_HEIGHT);
        Lines.setColor(lineColor);
        Lines.setFilled(true);
        Lines.setFillColor(lineColor);
        add(Lines);
    }

    // Draws the right line of the flag, filled with green
    void PrintCountryFlagName() {
        GLabel CountryFlagName = new GLabel("Flag of Nigeria", 0, 0);
        CountryFlagName.setFont("SansSerif-30");
        add(CountryFlagName);
        CountryFlagName.setLocation((int) (getWidth() - CountryFlagName.getWidth()), (int) (getHeight() - CountryFlagName.getDescent()));
    }
}
