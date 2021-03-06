package ex24.base;

import java.util.Arrays;

public class AnagramDetector {

    private static int length;

    public boolean isAnagram(String word1, String word2){
        int isSame = 0;
        if(word1.length() == word2.length()){
            word1 = removeDuplicates(word1);
            word2 = removeDuplicates(word2);
            length = word1.length();
            for(int i = 0; i < length; i++){
                for (int j = 0; j < length; j++){
                    if (word1.charAt(i) == word2.charAt(j)){
                        ++isSame;
                    }
                }
            }
        }
        if (length != 0 &&  isSame == length){
            return true;
        }
        else{
            return false;
        }
    }

    public String removeDuplicates(String word){
        char letters[] = word.toCharArray();
        int index = 0;

        for (int i = 0; i < word.length(); i++) {
            int j;

            for (j = 0; j < i; j++) {
                if (letters[i] == letters[j])
                {
                    break;
                }
            }

            if (j == i) {
                letters[index++] = letters[i];
            }
        }
        return String.valueOf(Arrays.copyOf(letters, index));
    }
}
