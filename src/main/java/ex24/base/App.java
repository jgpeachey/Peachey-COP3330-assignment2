/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 first_name last_name
 */

package ex24.base;

/*
Create a program that compares two strings and determines if the two strings
are anagrams. The program should prompt for both input strings and display the
output as shown in the example that follows.

Example Output:
Enter two strings and I'll tell you if they are anagrams:
Enter the first string: note
Enter the second string: tone
"note" and "tone" are anagrams.

Constraints:
*Implement the program using a function called isAnagram, which takes in
two words as its arguments and returns true or false. Invoke this
function from your main program.
*Check that both words are the same length.

Challenge:
Complete this program without using built-in language features. Use
selection or repetition logic instead and develop your own algorithm.
 */

import java.util.Scanner;

public class App {
    private static final Scanner in = new Scanner(System.in);

    private static String word1;
    private static String word2;


    public static void main(String[] args) {
        readInput();

        AnagramDetector ad = new AnagramDetector();

        String output = makeOutput(ad.isAnagram(word1, word2));

        System.out.println(output);
    }

    public static void readInput(){
        System.out.println("Enter two strings and I'll tell you if they are anagrams: ");
        System.out.println("Enter the first string: ");
        word1 = in.next();
        System.out.println("Enter the second string: ");
        word2 = in.next();

    }

    public static String makeOutput(boolean isAnagram){
        if(isAnagram){
            return "\""+word1+"\" and \""+word2+"\" are anagrams.";
        }
        else{
            return "\""+word1+"\" and \""+word2+"\" are not anagrams.";
        }
    }
}
