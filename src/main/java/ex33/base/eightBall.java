package ex33.base;

import ex32.base.App;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class eightBall {

    public String randAns() {
        String ans[] = new String[]{"Yes", "No", "Maybe", "Ask again later"};
        double num = Math.random()*4.0-1.0;
        return ans[(int) num];
    }
}
