package Algorithm.DynamicProgramming;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Nikhi on 9/26/2016.
 */
public class ArraySplitting {
    /*public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int maxScore = 0;
        if(t>=1 && t<=10){
            int size = sc.nextInt();
            if(size>=1 && size<= (int)Math.pow(2,14) && size%2 == 0){
                int[] input = new int[size];
                for(int i=0;i<size;i++) {
                    int temp = sc.nextInt();
                    if (temp >= 0 && temp <= (int) Math.pow(10, 9)) {
                        input[i] = sc.nextInt();
                    }
                }


                //findScore(input);



            }else{
                System.out.print(maxScore);
            }
        }

    }*/
    private static int findMaxDivideCount(int[] inputs) {
        int n = inputs.length;

        // Return 0 if array can't be partitioned (need at least 2 elements to split)
        if(n < 2) {
            return 0;
        }

        // Initialize rightSum as array sum
        int rightSum = 0;
        for (int i = 0; i < n; i++) {
            rightSum += inputs[i];
        }

        // Determine if array can be partitioned into equal leftSum and rightSum
        int leftSum = 0;
        int partitionIndex = 0;
        boolean isEqual = false;
        do {
            // Deduct each value added to rightSum from leftSum
            leftSum += inputs[partitionIndex];
            rightSum -= inputs[partitionIndex];

            // Check balance (i.e., are the two sums equal yet?)
            if(leftSum == rightSum){
                isEqual = true;
                break;
            }

        } while(++partitionIndex < n);

        // If sums are not equal, return 0 as current array can't be split into halves with equal sums
        if(!isEqual) {
            return 0;
        }

        // Else she gets 1 point, continue checking the left/right subarrays
        return 1 + Math.max(
                findMaxDivideCount(Arrays.copyOfRange(inputs, 0, partitionIndex + 1)),
                findMaxDivideCount(Arrays.copyOfRange(inputs, partitionIndex + 1, n))
        );
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numGames = in.nextInt();

        for (int i = 0; i < numGames; i++) {
            int n = in.nextInt();
            int[] inputs = new int[n];

            for (int j = 0; j < n; j++) {
                inputs[j] = in.nextInt();
            }

            System.out.println(findMaxDivideCount(inputs));
        }
        in.close();
    }
}

