package Algorithm.Implementation;

import java.util.Scanner;

/**
 * Created by Nikhi on 9/23/2016.
 */
public class Repeatedstring {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        long n = in.nextLong();
        int fixedACount = 0;

        //first need to figure out how many a's in given string
        for(int i=0;i<s.length(); i++){
            if(s.charAt(i) == 'a'){
                fixedACount++;
            }
        }

        //Now chcek how many times string is reapeating
        //Divide length of string by N
        long repeatCount =  (n/ s.length());
        long totalACount =  repeatCount * fixedACount;

        //Not done yet, if number is not totally divisible there would be some
        // number of A's we need to add to final Count
        //for that we get that mod reminder
        // use that reminder again to check how many A's in original stirng
        int leftOver = (int) (n% s.length());
        int leftOverACount = 0;
        for(int i = 0; i<leftOver ; i++){
            if(s.charAt(i) == 'a'){
                leftOverACount++;
            }
        }
        totalACount += leftOverACount;
        System.out.println(totalACount);

    }
}
