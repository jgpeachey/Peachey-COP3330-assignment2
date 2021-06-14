/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 first_name last_name
 */

package ex34.base;

/*
Create a small program that contains a list of employee names. Print out the list of names when the program runs the first time. Prompt for an employee name and remove that specific name from the list of names. Display the remaining employees, each on its own line.

Example Output
There are 5 employees:
John Smith
Jackie Jackson
Chris Jones
Amanda Cullen
Jeremy Goodwin

Enter an employee name to remove: Chris Jones

There are 4 employees:
John Smith
Jackie Jackson
Amanda Cullen
Jeremy Goodwin
Constraint
Use an array or list to store the names.
Challenges
If the user enters a name that’s not found, print out an error message stating that the name does not exist.
Read in the list of employees from a file, with each employee on its own line.
Write the output to the same file you read in.
 */

import java.util.ArrayList;
import java.util.Scanner;

public class App { // how do i test random, like bro
    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        EmployeeManifest list = new EmployeeManifest();

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