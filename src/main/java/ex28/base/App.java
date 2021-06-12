/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 first_name last_name
 */

package ex28.base;

/*
Write a program that prompts the user for five numbers and computes
the total of the numbers.

Example Output
Enter a number: 1
Enter a number: 2
Enter a number: 3
Enter a number: 4
Enter a number: 5
The total is 15.

Constraints:
*The prompting must use repetition, such as a counted loop, not three
separate prompts.
*Create a flowchart before writing the program.

Challenges:
*Modify the program to prompt for how many numbers to add, instead of
hard-coding the value. Be sure you convert the input to a number before
doing the comparison.
*Modify the program so that it only adds numbers and silently rejects
non-numeric values. Count these invalid entries as attempts anyway.
In other words, if the number of numbers to add is 5, your program should
still prompt only five times.
 */

import ex25.base.PasswordTester;
import ex26.base.PaymentCalculator;
import ex27.base.InputValidation;

import java.lang.reflect.Array;
import java.util.Scanner;

public class App {
    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        outputCreator(counter(inputCreator()));
    }

    public static double[] inputCreator(){ //forcibly made the program bigger since you cant test input :/
        double input[] = new double[5];
        int count = 0;
        while (count < 5){
            System.out.println("Enter a number: ");
            input[count] = in.nextDouble();
            ++count;
        }
        return input;
    }
    public static void outputCreator(double total){
        System.out.println("The total is "+total+".");
    }

    public static double counter(double[] input){  //forcibly made the program bigger since you cant test input :/
        int count = 0;
        double total = 0;
        while (count < 5){
            total += input[count];
            ++count;
        }
        return total;
    }
}