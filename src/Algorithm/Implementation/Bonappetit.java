package Algorithm.Implementation;

import java.util.Scanner;

/**
 * Created by Nikhi on 9/25/2016.
 */
public class Bonappetit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int indexK = sc.nextInt();
        int[] a = new int[n];
        int actualCharge = 0;
        int totalCharge = 0;
        for(int i =0; i<n;i++){
            a[i] = sc.nextInt();
            if(i!=indexK)
                actualCharge += a[i];

            totalCharge += a[i];
        }
        actualCharge = actualCharge/2;
        int charged = sc.nextInt();
        if(n>= 2 && n<= Math.pow(10,5) &&
                indexK >= 0 && indexK<n
                && charged >=0 && charged <= totalCharge)  {
            if(charged > actualCharge){
                System.out.println(charged - actualCharge);
            }else{
                System.out.println("Bon Appetit");
            }
        }


    }
}
