package Algorithm.Implementation;

import java.util.Scanner;

/**
 * Created by Nikhi on 9/24/2016.
 */
public class Jumpingontheclouds {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int c[] = new int[n];   //its binary integer input 0 0 1 0 0 1 0
        int jumps = 0;

        for(int c_i=0; c_i < n; c_i++){
            c[c_i] = in.nextInt();
        }
        if(n>=2 && n<=100){
            int i=0;
            while(i!=n-1){

                if(i+2!=n && c[i+2] == 0){
                    jumps++;
                    i+=2;
                }else if(c[i+1] == 0){
                    i++;
                    jumps++;
                }
                //if(i==n){

                //}
            }
            System.out.println(jumps);
        }
    }
}
