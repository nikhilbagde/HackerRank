package Algorithm.Implementation;

import java.util.Scanner;

/**
 * Created by Nikhi on 9/22/2016.
 * https://www.hackerrank.com/challenges/bigger-is-greater
 * Sample Input      Sample Output
 5
 ab                  ba
 bb                  no answer
 hefg               hegf
 dhck               dhkc
 dkhc               hcdk
 */
public class Biggerisgreater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        String [] a = new String[testCases];

        for(int i = 0; i< testCases ; i++){
            a[i] = sc.next();

        }

        for(int i = 0; i< testCases ; i++) {
            for (int j = a[i].length() - 1; j > 0; j--) {   // a[] = "ab", "bb", "hefg", "dhck", "dkhc"
                if (a[i].charAt(j - 1) < a[i].charAt(j)) {  // string[i].charat(j-1) [a]   < string[i].charat(j) [b]
                    char swap = a[i].charAt(j - 1);
                    //a[i] = a[i].replace(a[i].charAt(j-1), a[i].charAt(j));
                    //a[i] = a[i].replace(a[i].charAt(j), swap);

                    StringBuilder b = new StringBuilder(String.valueOf(a[i]));
                    b.setCharAt(j - 1, a[i].charAt(j));
                    b.setCharAt(j, swap);

                    a[i] = b.toString();
                    //System.out.println(a[i]);
                    break;

                    //you cant use direct swap with array of string  of those character
                    //you already have replace method to replace character of string, use that
                    // but once you do that using only replace will lose the new string which has replaced value
                    //hence dont forget it equate it to original string. hence I did, a[i] = .. replace logic

                    //Fuck you cant even use replace as replae will repalce all characters fromt he stirng.
                    //but we dont want that, I wanted to only replace particular character

                    //so there are two ways.
                    // convert string in char[] (character array) str.toCharArray();
                    // and then directly replace the character arrayChar[i] = 'any character you want to replace';

                    //second methid is to use string builder
                    //i thing which is easy, directly create string buildinger with passing string into constructer
                    // and then using in buil function setCharAt(location, character to replace)
                } else {
                    // a[i] = "no answer";
                }
            }
        }

        for (String str: a) {
            System.out.println(str);

        }


    }
}
/*
ab
bb
hefg
dhck
dkhc
 */