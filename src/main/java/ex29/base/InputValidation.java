package ex29.base;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class InputValidation {
    public int[] validateInput(String[] input) {
        int[] valid = new int[5];
        int allvalid = 0;

        valid[0] = nameValid(input[0]);
        valid[1] = nameValid(input[1]);
        valid[2] = zipCodeValid(input[2]);
        valid[3] = employeeValid(input[3]);

        for (int i = 0; i < 4; i++) {
            if (valid[i] == 1){
                ++allvalid;
            }
            if (allvalid == 4){
                valid[4] = 1;
            }
        }

        return valid;
    }

    public int nameValid(String name) {
        int n = 0;

        if (name.length() >= 2) {
            n = 1;
        } else if (name.length() > 0 && name.length() < 2) {
            n = 2;
        } else {
            n = 3;
        }

        return n;
    }

    public int zipCodeValid(String zip) {
        int n = 0;
        int nums = hasNums(zip, 0);

        if (nums == zip.length() && zip.length() == 5) {
            n = 1;
        } else {
            n = 2;
        }

        return n;
    }

    public int employeeValid(String id) {
        int n = 0;
        int nums = hasNums(id, 3);
        int letters = 0;

        for (int i = 0; i < 2; i++){
            if((id.charAt(i) >= 97 && id.charAt(i) <= 122) || (id.charAt(i) >= 65 && id.charAt(i) <= 90)){
                ++letters;
            }
        }

        if (id.charAt(2) == '-' && nums == 4 && letters == 2){
            n = 1;
        }
        else{
            n = 2;
        }

            return n;
    }

    public int hasNums(String word, int index){
        int nums = 0;
        for (int i = index; i < word.length(); i++){
            if(Character.isDigit(word.charAt(i))){
                ++nums;
            }
        }
        return nums;
    }
}
