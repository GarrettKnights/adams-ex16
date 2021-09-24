
/*
 *  UCF COP3330 Fall 2021 Assignment 16 Solution
 *  Copyright 2021 Garrett Adams
 */

package Exercise16;

import java.util.*;

public class Solution16 {
    public static void main(String[] args) {
        //Declares the variables we will be using
        int Age;
        int Min = 16;
        String statement;
        //Initializes the scanner
        Scanner ScanWord = new Scanner(System.in);

        //Asks user for input
        System.out.println("What is your age? ");
        //Scans input to Age
        Age=ScanWord.nextInt();

        //If age is at least 16 you can drive if under you cannot
        statement = (Age >= Min) ? ("You are old enough to legally drive.") : ("You are not old enough to legally drive.");

        //Final print statement
        System.out.println("" + statement);


    }
}

