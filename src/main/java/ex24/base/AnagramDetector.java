package ex24.base;

public class AnagramDetector {

    private static int length;

    public boolean isAnagram(String word1, String word2){
        int isSame = 0;
        if(word1.length() == word2.length()){
            length = word1.length();
            for(int i = 0; i < length; i++){
                for (int j = 0; j < length; j++){
                    if (word1.charAt(i) == word2.charAt(j)){
                        ++isSame;
                    }
                }
            }
        }
        if (length != 0 && isSame == length){
            return true;
        }
        else{
            return false;
        }
    }
}
