package Algorithm.Implementation;

import java.util.Scanner;

/**
 * Created by Nikhi on 9/21/2016.
 */
public class Cutthestick {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[n];
        int min;
        for(int i=0; i < n; i++){
            a[i] = in.nextInt();
            min = a[0];
            if(a[i]<min){
                min = a[i];
            }
            if(min == 0){
                //
            }
        }
        min = getMin(a);
        while(min>0){
            min = cut(min, a);
        }
    }
    public static int cut(int min, int[] a){
        int counter=0;
        for(int i=0; i<a.length ; i++){
            if(a[i]!=0){
                a[i] = a[i]-min;
                counter++;
            }
        }
        System.out.println(counter);
        return min = getMin(a);
    }
    public static int getMin(int[] a){
        int min = 0;
        for(int i = 0; i<a.length ; i++){
            if(a[i]!=0 ){
                min = a[i];
                break;
            }
        }
        for(int i =0; i<a.length ; i++){
            if(a[i]!=0){
                //min = a[i];
                if(a[i]<min){
                    min = a[i];
                }
            }
        }
        return min;
    }
}
