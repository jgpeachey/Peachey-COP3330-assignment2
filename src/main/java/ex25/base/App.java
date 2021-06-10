/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 first_name last_name
 */

package ex25.base;

/*
Create a program that determines the complexity of a given password based on
these rules:

A very weak password contains only numbers and is fewer than eight characters.
A weak password contains only letters and is fewer than eight characters.
A strong password contains letters and at least one number and is at least eight characters.
A very strong password contains letters, numbers, and special characters and is at least eight characters.

Example Output:
The password '12345' is a very weak password.
The password 'abcdef' is a weak password.
The password 'abc123xyz' is a strong password.
The password '1337h@xor!' is a very strong password.

Constraints:
*Create a passwordValidator function that takes in the password as its argument
and returns a value you can evaluate to determine the password strength. Do not
have the function return a string—you may need to support multiple languages in
the future.
*Use a single output statement.

Challenge:
Create a GUI application or web application that displays graphical feedback as
well as text feedback in real time. As someone enters a password, determine its
strength and display the result
 */

import java.util.Scanner;

public class App {
    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        PasswordTester test = new PasswordTester();

        System.out.println("Please enter a password.");
        String password = in.nextLine();

        outputCreator(password, test.passwordValidator(password));
    }

    public static void outputCreator(String password, int strength){
        switch (strength){
            case 1:
                System.out.println("The password '"+password+"' is a very weak password.");
                break;
            case 2:
                System.out.println("The password '"+password+"' is a weak password.");
                break;
            case 3:
                System.out.println("The password '"+password+"' is a strong password.");
                break;
            case 4:
                System.out.println("The password '"+password+"' is a very strong password.");
                break;
        }
    }
}