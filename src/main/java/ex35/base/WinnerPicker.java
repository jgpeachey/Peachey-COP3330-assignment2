package ex35.base;

import ex32.base.App;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WinnerPicker {

    public Object theChosen(ArrayList names) {
        double size = names.size();
        double chosen = randNum(size);
        return names.get((int) chosen);
    }

    public double randNum(double size){
        double num = Math.random()*size;
        return (int) num;
    }
}
