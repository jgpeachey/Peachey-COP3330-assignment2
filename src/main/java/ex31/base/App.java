/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 first_name last_name
 */

package ex31.base;

/*
When you loop, you can control how much you increment the counter; you don’t
always have to increment by one.

When getting into a fitness program, you may want to figure out your target
heart rate so you don’t overexert yourself. The Karvonen heart rate formula
is one method you can use to determine your rate. Create a program that
prompts for your age and your resting heart rate. Use the Karvonen formula
to determine the target heart rate based on a range of intensities from 55%
to 95%. Generate a table with the results as shown in the example output.
The formula is

TargetHeartRate = (((220 − age) − restingHR) × intensity) + restingHR
Example Output
Resting Pulse: 65        Age: 22

Intensity    | Rate
-------------|--------
55%          | 138 bpm
60%          | 145 bpm
65%          | 151 bpm
:               :        (extra lines omitted)
85%          | 178 bpm
90%          | 185 bpm
95%          | 191 bpm

Constraints:
*Don’t hard-code the percentages. Use a loop to increment the percentages
from 55 to 95.
*Ensure that the heart rate and age are entered as numbers. Don’t allow the
user to continue without entering valid inputs.
*Display the results in a tabular format.

Challenge:
*Implement this as a GUI program that allows the user to use a slider
control for the intensity, and update the interface in real time as the
slider moves.
 */

import java.util.Scanner;

public class App {
    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        ex31.base.Calculator calc = new Calculator();

        double input[] = new double[2];
        input = inputCreator();

        outputCreator(input, calc.targetHeartRate(input));
    }

    public static double[] inputCreator(){
        double input[] = new double[2];
        System.out.println("What is your resting pulse?");
        input[0] = isNumber();
        System.out.println("What is your age?");
        input[1] = isNumber();
        return input;
    }

    public static void outputCreator(double[] input, double[] result) {
        String inten = "Intensity";
        String rate = "Rate";
        String percent = "%";
        System.out.printf( "Resting Pulse: %-10.0f Age: %.0f %n", input[0], input[1]);
        System.out.printf( "%-13s| %s %n", inten, rate);
        System.out.printf("-------------|--------%n");
        for (int i = 0; i < 18; i+=2) {
            System.out.printf("%.0f%-11s| %.0f bpm%n", result[i], percent, result[i+1]);
        }
    }

    static double isNumber(){
        int i = 1;
        double input = 0;
        boolean honest = in.hasNextDouble();
        while(i == 1){
            if(honest){
                input = in.nextDouble();
                if(input != 0){
                    i = 0;
                }
                else{
                    System.out.println("Sorry. That's not a valid input.");
                    in.nextLine();
                    honest = in.hasNextDouble();
                }
            }
            else{
                System.out.println("Sorry. That's not a valid input.");
                in.nextLine();
                honest = in.hasNextDouble();
            }
        }
        return input;
    }
}