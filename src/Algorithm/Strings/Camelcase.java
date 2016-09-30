package Algorithm.Strings;

import java.util.Scanner;

/**
 * Created by Nikhi on 9/28/2016.
 */
public class Camelcase {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int wordCount = 1;
        for (int i = 2; i < s.length(); i++) {
            if(Character.isUpperCase(s.charAt(i))){
                wordCount++;
            }
            if((i+2)<s.length() && Character.isUpperCase(s.charAt(i+2))){
                wordCount++;
                i+=2;
            }
        }
        System.out.println(wordCount);
    }
}
