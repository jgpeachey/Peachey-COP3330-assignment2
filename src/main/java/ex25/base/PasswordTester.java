package ex25.base;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordTester {

    public int passwordValidator(String password){
        int result = 0;
        int nums = hasNums(password);

        if(password.length() < 8){
            if(nums == password.length()){
                result = 1;
            }
            else if(nums == 0){
                result = 2;
            }
        }
        else{
            if (nums != password.length() && nums > 0 && hasSpecial(password)){
                result = 4;
            }
            else if(nums != password.length() && nums > 0){
                result = 3;
            }
        }
        return result;
    }

    public int hasNums(String password){
        int nums = 0;
        for (int i = 0; i < password.length(); i++){
            if(Character.isDigit(password.charAt(i))){
                ++nums;
            }
        }
        return nums;
    }

    public boolean hasSpecial(String password){
        Pattern p = Pattern.compile("[^A-Za-z0-9]");
        Matcher m = p.matcher(password);
        // boolean b = m.matches();
        boolean result = m.find();
        return result;
    }
}
