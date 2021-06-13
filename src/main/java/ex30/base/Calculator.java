package ex30.base;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Calculator {
    public int[] multiplicationTable() {
        int[] table = new int[144];
        int count = 0;

        for (int i = 1; i < 13; i++) {
            for (int j = 1; j < 13; j++) {
                table[count] = i*j;
                ++count;
            }
        }

        return table;
    }
}
