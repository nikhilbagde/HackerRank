package CrackingTheCodingInterview.Chapter1;

/**
 * Created by Nikhi on 10/14/2016.
 */
public class Question1 {
    public static boolean isUniqueChars(String str) {
        if (str.length() > 128) {
            return false;
        }
        int checker = 0;
        for (int i = 0; i < str.length(); i++) {
            int val = str.charAt(i) - 'a'; // Difference with a =  97
            if ((checker & (1 << val)) > 0) return false;
            checker |= (1 << val); //Its like addition 0011 (3) + 0100 (4) = 0111 (7)
        }
        return true;
    }

    public static boolean isUniqueChars2(String str) {
        if (str.length() > 128) {
            return false;
        }
        boolean[] char_set = new boolean[128];
        for (int i = 0; i < str.length(); i++) {
            int val = str.charAt(i);
            if (char_set[val]) return false;
            char_set[val] = true;
        }
        return true;
    }

    public static void main(String[] args) {
        String[] words = {"abcde", "hello", "apple", "kite", "padle"};
        for (String word : words) {
            System.out.println(word + ": " + isUniqueChars(word) + " " + isUniqueChars2(word));
        }
    }
}
