package ProjectEuler;

import java.util.Scanner;

/**
 * Created by Nikhi on 10/12/2016.
 */
public class Problem1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = in.nextInt();
        int sum = 0;
        for(int a0 = 0; a0 < testCases; a0++){
            int n = in.nextInt();
            for (int i = 1; i < n; i++) {
                if(i%3 ==0 || i%5 ==0){
                    sum+= i;
                }
            }
            System.out.println(sum);
        }

    }
}
