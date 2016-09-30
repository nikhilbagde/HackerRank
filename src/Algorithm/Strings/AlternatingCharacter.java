package Algorithm.Strings;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Nikhi on 9/29/2016.
 */
public class AlternatingCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCount = sc.nextInt();
        String[] a = new String[testCount];

        for (int i = 0; i < testCount; i++) {
            a[i] = sc.next();
        }

        deleteAlternativeCharacter(a);
    }
    private static void deleteAlternativeCharacter(String [] a){
        for (String input : a) {

            int noOfDeletions = 0;
            char[] chars = input.toCharArray();
            for (int i = 0; i < chars.length; i++) {
                char currChar = chars[i];
                char nextChar = i + 1 == chars.length ? 'c' : chars[i + 1];

                if (currChar == nextChar) {
                    noOfDeletions++;
                }
            }
            System.out.println(noOfDeletions);
        }
        /*for (String str: a) {
            if(str.length()==1){
                return;
            }
            int originalLength = str.length();
            str = str.replace("AA","A");
            str = str.replace("BB","B");
            int newLenght = str.length();

            int numberOfRemoval = originalLength-newLenght;
            System.out.println(numberOfRemoval);
            StringBuilder  strB = new StringBuilder(str);
            *//*int count=0, i=0;
            do{
                if(strB.charAt(i) == strB.charAt(i+1)){
                    strB.deleteCharAt(i);
                    i=0;
                    count++;
                }else{
                    i++;
                }
            }while(i<strB.length()-1);
            System.out.println(count);
        *//*}*/
    }
}
