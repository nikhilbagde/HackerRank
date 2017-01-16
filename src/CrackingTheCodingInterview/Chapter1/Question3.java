package CrackingTheCodingInterview.Chapter1;

import com.sun.xml.internal.fastinfoset.util.StringArray;

import java.util.Arrays;

/**
 * Created by Nikhil on 10/25/2016.
 * Given two strings, write a method to determine one is permutation of another.
 */
public class Question3 {
    public static void main(String[] args) {
        String first = "first";
        String second = "rstfi";

        //boolean result = first.i;
        boolean result = permutation(first, second);
        System.out.println(result);

    }
    private static boolean permutation(String first, String second){
        if(first.length() != second.length()){
            return false;
        }
        int[] letters = new int[256];   //assume 256 unique letters
        /*for (int i = 0; i < first.length(); i++) {
            letters[(int) first.charAt(i)]++;
        }*/
        for (char c: first.toCharArray()) {
            letters[c]++;
        }

        for (int i = 0; i < second.length(); i++) {
            int c = second.charAt(i);
            --letters[c];
            if (letters[c] < 0){
                return false;
            }
        }
        return true;
    }
    private static boolean permutation2(String a, String b){
        if(a.length()!= b.length()){
            return false;
        }
        String aa = sort(a);
        String bb = sort(b);

        return aa.equals(bb);
    }
    private static String sort(String a ){
        char[] array = a.toCharArray();
        java.util.Arrays.sort(array);
        return Arrays.toString(array);          //Array -> String
    }
}

