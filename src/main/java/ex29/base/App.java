/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 first_name last_name
 */

package ex29.base;

/*
Write a quick calculator that prompts for the rate of return on an
investment and calculates how many years it will take to double your
investment.

The formula is
years = 72 / r
where r is the stated rate of return.

Example Output:
What is the rate of return? 0
Sorry. That's not a valid input.
What is the rate of return? ABC
Sorry. That's not a valid input.
What is the rate of return? 4
It will take 18 years to double your initial investment.

Constraints:
Don’t allow the user to enter 0.
Don’t allow non-numeric values.
Use a loop to trap bad input, so you can ensure that the user enters valid values.

Challenge
Display a different error message when the user enters 0.
 */

import java.util.Scanner;

public class App {
    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        Calculator calc = new Calculator();

        double input; //B.A.M. = Balance, APR, Payment
        input = inputCreator();

        outputCreator(calc.yearsToDouble(input));
    }

    public static double inputCreator(){
        System.out.println("What is the rate of return?");
        double input = isNumber();
        return input;
    }
    public static void outputCreator(double num){
        System.out.println("It will take "+num+" years to double your initial investment.");
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