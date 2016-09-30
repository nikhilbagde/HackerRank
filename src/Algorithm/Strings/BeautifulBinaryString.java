package Algorithm.Strings;

import java.util.Scanner;

/**
 * Created by Nikhi on 9/29/2016.
 *
 *? HOw to convert String to array ?
 */
public class BeautifulBinaryString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        String input = sc.next();
        char[] a = input.toCharArray();
        System.out.println((input.length() - input.replaceAll("010", "").length())/3);

       // makeBeautiful(a, input);
    }
    private static void makeBeautiful(char[] a, String input){
        String subString  = "010";

        if(input.contains(subString)){
            
        }

    }
}
