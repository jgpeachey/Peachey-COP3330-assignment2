package ex31.base;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Calculator {
    public double[] targetHeartRate(double[] input) {
        double[] table = new double[18];
        int percent = 55;
        double restingHR = input[0];
        double age = input[1];



        for (int i = 0; i < 18; i+=2) {
            table[i] = percent;
            double intensity = percent/100.0;
            table[i+1] = (((220-age)-restingHR)*intensity) + restingHR;
            percent += 5;
        }

        return table;
    }
}
