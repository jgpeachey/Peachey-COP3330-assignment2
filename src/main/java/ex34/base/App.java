/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 first_name last_name
 */

package ex34.base;

/*
Create a Magic 8 Ball game that prompts for a question and then displays either "Yes," "No," "Maybe," or "Ask again later."

Example Output
What's your question?
> Will I be rich and famous?

Ask again later.
Constraint
The value should be chosen randomly using a pseudo random number generator. Store the possible choices in a list and select one at random.
Challenges
Implement this as a GUI application.
If available, use native device libraries to allow you to “shake” the 8 ball.
 */

import ex31.base.Calculator;
import ex32.base.NumberGame;
import ex33.base.eightBall;

import java.util.ArrayList;
import java.util.Scanner;

public class App { // how do i test random, like bro
    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        employeeManifest list = new employeeManifest();

        outputCreator(list.employees());
        String input = inputCreator();

        list.employeeRemover(input, list.employees());

        outputCreator(list.employees());
    }

    public static void outputCreator(ArrayList ans) {
        System.out.println("\nThere are "+ans.size()+" employees:");
        ans.forEach(System.out::println);
    }

    public static String inputCreator(){
        System.out.println("\nEnter an employee name to remove: ");
        return in.nextLine();
    }

}