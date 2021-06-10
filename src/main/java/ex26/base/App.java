/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 first_name last_name
 */

package ex26.base;

/*
Write a program that will help you determine how many months it will take
to pay off a credit card balance. The program should ask the user to enter
the balance of a credit card, the APR of the card, and their monthly payment.
The program should then return the number of months needed (rounded up to the
next integer value).

The formula for this is:
n = -(1/30) * log(1 + b/p * (1 - (1 + i)^30)) / log(1 + i)
where
n is the number of months.
i is the daily rate (APR divided by 365).
b is the balance.
p is the monthly payment.

Example Output:
What is your balance? 5000
What is the APR on the card (as a percent)? 12
What is the monthly payment you can make? 100
It will take you 70 months to pay off this card.

Constraints:
*Prompt for the card’s APR. Do the division internally.
*Prompt for the APR as a percentage, not a decimal.
*Use a class called PaymentCalculator with a public method called
calculateMonthsUntilPaidOff, which returns the number of months.
*Round fractions of a cent up to the next cent.

Challenge:
*Rework the formula so the program can accept the number of months as an
input and compute the monthly payment.
*Create a version of the program that lets the user choose whether to
figure out the number of months until payoff or the amount needed to pay
per month.
 */

import ex25.base.PasswordTester;

import java.lang.reflect.Array;
import java.util.Scanner;

public class App {
    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        PaymentCalculator calc = new PaymentCalculator();

        double bap[] = new double[3]; //B.A.M. = Balance, APR, Payment
        bap = inputCreator();

        outputCreator(calc.calculateMonthsUntilPaidOff(bap));
    }

    public static double[] inputCreator(){
        double bap[] = new double[3];
        System.out.println("What is your balance? ");
        bap[0] = in.nextDouble();
        System.out.println("What is the APR on the card (as a percent)? ");
        bap[1] = (in.nextDouble()/100.0);
        System.out.println("What is the monthly payment you can make? ");
        bap[2] = in.nextDouble();
        return bap;
    }
    public static void outputCreator(double months){
        System.out.println("It will take you "+months+" months to pay off this card.");
    }
}