package Algorithm.Implementation;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * Created by Nikhi on 9/23/2016.
 */
public class Nondivisiblesubset {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();

        int[] a = new int[N];
        Set<Integer> subSet = new HashSet<Integer>();
        //int counter = 0;
        if(N>=1 && N<= ((int) Math.pow(10,5)) && K>=1 && K<= 100){
            for(int i=0;i<N;i++){
                int temp = sc.nextInt();
                if(temp <= Math.pow(10,9) && temp >= 1){
                    a[i] = temp;
                }
            }
            //Arrays.sort(a);
            for(int i=0;i<N;i++){
                for(int j=i; j<N;j++){
                    if(i!=j && (a[i]+a[j])%K != 0){
                        subSet.add(a[i]);
                        subSet.add(a[j]);
                        //counter++;
                    }
                }
            }
            System.out.println(subSet.size());
            //System.out.println(counter);
        }

    }
}

/*
Test Case 1:
4 3
1 7 2 4
Expected Output : 3

Test Case 2:
6 9
422346306 940894801 696810740 862741861 85835055 313720373
Expected Output : 5

Test Case 3:
5 5
2 7 12 17 22
Expected outout 5
 */
