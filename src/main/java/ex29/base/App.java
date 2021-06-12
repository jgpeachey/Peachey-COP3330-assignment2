/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 first_name last_name
 */

package ex29.base;

/*
Write a program that prompts for a first name, last name, employee ID, and
ZIP code. Ensure that the input is valid according to these rules:

The first name must be filled in.
The last name must be filled in.
The first and last names must be at least two characters long.
An employee ID is in the format AA-1234. So, two letters, a hyphen, and four numbers.
The ZIP code must be a number.
Display appropriate error messages on incorrect data.

Example Output:
Enter the first name: J
Enter the last name:
Enter the ZIP code: ABCDE
Enter the employee ID: A12-1234
The first name must be at least 2 characters long.
The last name must be at least 2 characters long.
The last name must be filled in.
The employee ID must be in the format of AA-1234.
The zipcode must be a 5 digit number.
        Or
Enter the first name: John
Enter the last name: Johnson
Enter the ZIP code: 55555
Enter the employee ID: TK-4321
There were no errors found.

Constraints:
*Create a function for each type of validation you need to write. Then create
a validateInput function that takes in all of the input data and invokes the
specific validation functions.
*Use a single output statement to display the outputs.

Challenges:
*Use regular expressions to validate the input.
*Implement this as a GUI application or web application that gives immediate
feedback when the fields lose focus.
*Repeat the process if the input is not valid.
 */

import ex25.base.PasswordTester;
import ex26.base.PaymentCalculator;
import ex27.base.InputValidation;

import java.lang.reflect.Array;
import java.util.Scanner;

public class App {
    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        InputValidation validator = new InputValidation();

        String input[] = new String[4]; //B.A.M. = Balance, APR, Payment
        input = inputCreator();

        outputCreator(validator.validateInput(input));
    }

    public static String[] inputCreator(){
        String input[] = new String[4];
        System.out.println("Enter the first name: ");
        input[0] = in.nextLine();
        System.out.println("Enter the last name: ");
        input[1] = in.nextLine();
        System.out.println("Enter the ZIP code: ");
        input[2] = in.nextLine();
        System.out.println("Enter the employee ID: ");
        input[3] = in.nextLine();
        return input;
    }
    public static void outputCreator(int[] valid){
        if(valid[0] == 2){
            System.out.println("The first name must be at least 2 characters long.");
        }
        else if (valid[0] == 3){
            System.out.println("The first name must be at least 2 characters long. \nThe first name must be filled in.");
        }
        if(valid[1] == 2){
            System.out.println("The last name must be at least 2 characters long.");
        }
        else if (valid[1] == 3){
            System.out.println("The last name must be at least 2 characters long. \nThe last name must be filled in.");
        }
        if(valid[2] == 2){
            System.out.println("The zipcode must be a 5 digit number.");
        }
        if(valid[3] == 2){
            System.out.println("The employee ID must be in the format of AA-1234.");
        }
        if(valid[4] == 1){
            System.out.println("There were no errors found.");
        }
    }
}