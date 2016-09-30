package Algorithm.Strings;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * Created by Nikhil on 9/29/2016.
 * 1. How to convert String to Set ? -> Set<String> gemSet1 = new HashSet<String>(Arrays.asList(a, where a is array of strings));
 * 2. Set1 and Set2 both are of character type, and Set1.retainAll(Set2) will give intersection of two sets.
 * 3. Awesome.
 */

public class GemStones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        String[] a = new String[number];

        for (int i = 0; i < number; i++) {
            a[i] = sc.next();
        }
        System.out.println(getNumberGems(a));
    }
    private static int getNumberGems(String[] a){
        Set<Character> gemSet = new HashSet<>();


        char[] firstString = a[0].toCharArray();
        //Set<Character> gemSet1 = new HashSet<Character>(Arrays.asList(firstString));
        // "abcdde" , baccd , eeabg
        for (int i = 0; i < firstString.length; i++) {
            //"abcdde"
            gemSet.add(firstString[i]);
        }
        //Iterate each string from array of Strings
        // abcdde , "baccd , eeabg"
        for (int j = 1; j<a.length; j++) {
            Set<Character> gemSet2 = new HashSet<>();
            //accd
            char[] strC = a[j].toCharArray();
            for (int i = 0; i < strC.length; i++) {
                gemSet2.add(strC[i]);
            }
            gemSet.retainAll(gemSet2);
        }
        return gemSet.size();
    }
}
