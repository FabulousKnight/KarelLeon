package com.shpp.p2p.cs.LIlin.assignment2;

import com.shpp.cs.a.console.TextProgram;

public class Assignment2Part1 extends TextProgram {
    public void run() {
        //We are asking User to input his numbe A
        double a = readInt("Please enter a: ");
        // We are asking user to input his number B
        double b = readInt("Please enter b: ");
        // We are asking user to input his number C
        double c = readInt("Please enter c: ");
        /* We are counting discriminant to understand how many
         * roots will have our quadratic equasion
         */
        double Discriminant = (b * b) - (4 * a * c);
        /* If Discriminant higher than zero we will have two roots,
         * which is counted by formula and then both printed
         */
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
            // If Discriminant lower than zero, there will be no roots, and we are printing it
        } else {
            println("There is no roots");
        }
    }
}
