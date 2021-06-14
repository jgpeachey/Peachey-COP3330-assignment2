/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 first_name last_name
 */

package ex35.base;

/*
Create a program that picks a winner for a contest or prize drawing. Prompt for names of contestants until the user leaves the entry blank. Then randomly select a winner.

Example Output
Enter a name: Homer
Enter a name: Bart
Enter a name: Maggie
Enter a name: Lisa
Enter a name: Moe
Enter a name:
The winner is... Maggie.
Constraints
Use a loop to capture user input into an array.
Use a random number generator to pluck a value from the array.
Don’t include a blank entry in the array.
Some languages require that you define the length of the array ahead of time. You may need to find another data structure, like an ArrayList.
Challenges
When a winner is chosen, remove the winner from the list of contestants and allow more winners to be chosen.
Make a GUI program that shows the array of names being shuffled on the screen before a winner is chosen.
Create a separate contest registration application. Use this program to pull in all registered users and pick a winner.
 */

import java.util.ArrayList;
import java.util.Scanner;

public class App { // how do i test random, like bro
    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        WinnerPicker list = new WinnerPicker();

        outputCreator(list.theChosen(inputCreator()));

    }

    public static void outputCreator(Object winner) {
        System.out.println("The winner is... "+winner);
    }

    public static ArrayList inputCreator(){
        int i = 0;
        ArrayList<String> names = new ArrayList<String>();
        while (i == 0) {
            System.out.println("Enter a name: ");
            String input = in.nextLine();
            if(input.equals("")){
                i = 1;
            }
            else{
                names.add(input);
            }
        }
        return names;
    }

}