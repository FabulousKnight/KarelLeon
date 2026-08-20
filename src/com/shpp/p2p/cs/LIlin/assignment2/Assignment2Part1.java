package com.shpp.p2p.cs.LIlin.assignment2;

import com.shpp.cs.a.console.TextProgram;

/* This program solves a quadratic equation of the form a*x^2 + b*x + c = 0.
 * The user enters coefficients a, b and c, the program calculates the
 * discriminant, and depending on its sign, prints two roots, one root,
 * or a message that there are no real roots.
 */

public class Assignment2Part1 extends TextProgram {
    /* In this method we are asking user to input 3 numbers
     * and counting amount of roots in a quadratic equation, after calculation
     * results is printed on the display
     */
    public void run() {
        //We are asking User to input his numbe A
        double a = readDouble("Please enter a: ");
        // We are asking user to input his number B
        double b = readDouble("Please enter b: ");
        // We are asking user to input his number C
        double c = readDouble("Please enter c: ");
        /* We are counting discriminant to understand how many
         * roots will have our quadratic equasion
         */
        if(a == 0){
            println("There is no roots");
        } else {
            double Discriminant = (b * b) - (4 * a * c);
            if (Discriminant > 0) {
                double x1 = (-b + Math.sqrt(Discriminant)) / (2 * a);
                double x2 = (-b - Math.sqrt(Discriminant)) / (2 * a);
                println("There is two roots: " + x1 + "and " + x2);
                /*If Discriminant is zero we will have one root,
                 * which is counted by formula and then printed
                 */
            } else if (Discriminant == 0) {
                double x = -b / (2 * a);
                println("There is one root: " + x);
                /* If Discriminant lower than zero, there will be no roots, and we are printing it */
            } else {
                println("There is no roots");
            }
        }
        /* If Discriminant higher than zero we will have two roots,
         * which is counted by formula and then both printed
         */

    }
}

