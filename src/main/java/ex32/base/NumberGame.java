package ex32.base;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NumberGame {
    private static final Scanner in = new Scanner(System.in);
    App app = new App();

    public void gameCenter() {
        String yn = "y";
        int number = 0;
        System.out.println("Let's play Guess the Number!\n");
        while(yn.equalsIgnoreCase("y")){
            number = difficultyMaker();
            guesser(number);
            yn = playAgain();
        }
    }

    public void guesser(int number){
        int guess = 1;
        int i = 0;
        int numGuesses = 0;
        System.out.println("I have my number. What's your guess? ");
        while (guess != number){
            guess = app.inputCreator(2);
            if (guess == number){
                i = 0;
            }
            else if (guess < number){
                i = 1;
            }
            else if (guess > number){
                i = 2;
            }
            else if (guess == -1){
                i = -1;
            }
            ++numGuesses;
            app.outputCreator(i, numGuesses);
        }
    }

    public int difficultyMaker(){
        double number = 0;
        int difficulty = 0;
        System.out.println("Enter the difficulty level (1, 2, or 3): ");
        difficulty = app.inputCreator(1);
        while (difficulty != 1 && difficulty != 2 && difficulty != 3){
            System.out.println("Sorry. That's not a valid input.");
            difficulty = app.inputCreator(1);
        }
        switch (difficulty){
            case 1:
                number = Math.random()*10.0;
                break;
            case 2:
                number = Math.random()*100.0;
                break;
            case 3:
                number = Math.random()*1000.0;
                break;
        }
        number = Math.round(number);
        return (int) number;
    }

    public String playAgain(){
        System.out.println("Do you wish to play again (Y/N)? ");
        String answer = in.next();
        return answer;
    }
}
