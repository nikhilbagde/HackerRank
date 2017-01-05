package Algorithm.DynamicProgramming;

import java.util.Scanner;

/**
 * Created by Nikhil on 1/5/2017 12:28 AM.
 */
public class RodCutting {
    int [] profit;
    int maxLength;
    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        RodCutting rodCutting = new RodCutting();

        rodCutting.getInput();
        rodCutting.findMaximumProfit();

    }
    private void getInput(){
        System.out.println("Please provide Total length of the Rod ");
        maxLength = scanner.nextInt();
        profit = new int[maxLength+1];
        System.out.println("Please provide Profit respective rod lengths:");
        for (int length = 0; length < profit.length; length++) {
            profit[length] = scanner.nextInt();
        }
    }

    private int findMaximumProfit(){
        int[] optimalProfit = new int[profit.length+1];
        optimalProfit[0] = 0;

        for (int length = 1; length <= maxLength ; length++) {
            int maximumProfit = Integer.MIN_VALUE;
            for (int possibilities = 0; possibilities < length; possibilities++) {
                maximumProfit = Math.max(maximumProfit , (profit[possibilities] + optimalProfit[length - possibilities - 1]) );
            }
            optimalProfit[length] = maximumProfit;
        }
        return optimalProfit[profit.length];
    }

}
