/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 first_name last_name
 */

package ex32.base;

/*
Write a Guess the Number game that has three levels of difficulty. The
first level of difficulty would be a number between 1 and 10. The second
difficulty set would be between 1 and 100. The third difficulty set would
be between 1 and 1000.

Prompt for the difficulty level, and then start the game. The computer picks
a random number in that range and prompts the player to guess that number.
Each time the player guesses, the computer should give the player a hint as
to whether the number is too high or too low. The computer should also keep
track of the number of guesses. Once the player guesses the correct number,
the computer should present the number of guesses and ask if the player would
like to play again.

Example Output:
Let's play Guess the Number!

Enter the difficulty level (1, 2, or 3): 1
I have my number. What's your guess? 5
Too low. Guess again: 7
Too low. Guess again: 9
You got it in 3 guesses!

Do you wish to play again (Y/N)? y

Enter the difficulty level (1, 2, or 3): 3
I have my number. What's your guess? 500
Too low. Guess again: 750
Too high. Guess again: 600
Too low. Guess again: 700
Too low. Guess again: 725
Too high. Guess again: 715
Too high. Guess again: 710
Too high. Guess again: 705
Too high. Guess again: 701
Too low. Guess again: 702
You got it in 10 guesses!

Do you wish to play again (Y/N)? n

Constraints:
Don’t allow any non-numeric data entry.
During the game, count non-numeric entries as wrong guesses.

Challenges:
*Map the number of guesses taken to comments:
1 guess: “You’re a mind reader!”
2–4 guesses: “Most impressive.”
3–6 guesses: “You can do better than that.”
7 or more guesses: “Better luck next time.”
*Keep track of previous guesses and issue an alert that the user has already
guessed that number. Count this as a wrong guess.
*Implement this as a graphical game with a grid of numbers. When a number is
clicked or tapped, remove the number from the screen.
 */

import ex31.base.Calculator;

import java.util.Scanner;

public class App {
    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        NumberGame game = new NumberGame();

        game.gameCenter();
    }

    public void outputCreator(int i, int guesses) {
        switch (i){
            case 0:
                System.out.println("You got it in "+guesses+" guesses!");
                break;
            case 1:
                System.out.println("Too low. Guess again: ");
                break;
            case 2:
                System.out.println("Too high. Guess again: ");
                break;
            case -1:
                System.out.println("Invalid input. Guess again: ");
                break;
        }
    }

    public int inputCreator(int type){
        int input = isNumber(type);
        return input;
    }

    public int isNumber(int type){
        int i = 1;
        int input = 0;
        boolean honest = in.hasNextInt();
        if(type == 1) {
            while (i == 1) {
                if (honest) {
                    input = in.nextInt();
                    i = 0;
                }
                else {
                    System.out.println("Sorry. That's not a valid input.");
                    in.nextLine();
                    honest = in.hasNextInt();
                }
            }
        }
        if(type == 2) {
            if (honest) {
                input = in.nextInt();
            }
            else {
                input = -1;
            }
        }
        return input;
    }
}