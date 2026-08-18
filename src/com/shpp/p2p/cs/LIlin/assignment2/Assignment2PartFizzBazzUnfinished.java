package com.shpp.p2p.cs.LIlin.assignment2;

import com.shpp.cs.a.console.TextProgram;

public class Assignment2PartFizzBazzUnfinished extends TextProgram {

    public void run() {
        double number = 0;
        do {
            number = readInt("Яке число?: ");
            if(number %3 == 0 && number %5 == 0 || number == 0){
                number += readInt("Bazz");
            } else if (number % 5 == 0) {
                number += readInt("Bazz");
            } else if (number %3 == 0) {
                number += readInt("Fizz");
            } else {
                number += number;
            }

        }while (number != 12);
        println(number);
    }
}
