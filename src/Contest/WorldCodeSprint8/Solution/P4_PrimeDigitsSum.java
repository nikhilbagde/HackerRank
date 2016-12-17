package Contest.WorldCodeSprint8.Solution;

import java.util.Scanner;

/**
 * Created by Nikhi on 12/17/2016 2:40 PM.
 */
public class P4_PrimeDigitsSum {
    static final int M = 1000000007;
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        assert (1<= q && q<= 2*Math.pow(10,4));
        for(int a0 = 0; a0 < q; a0++){
            int n = in.nextInt();
            assert (1<= n && n <= 4*Math.pow(10,5));
            int count = 0;
            // your code goes here
            if(n!=0) {
                StringBuilder start = new StringBuilder("1");
                StringBuilder end = new StringBuilder();
                for (int i = 0; i < n; i++) {
                    if (i != 0) start.append(0);
                    end.append(9);
                }
            /*System.out.println(start.toString());
            System.out.println(end.toString());*/
                count = countPrimeDigitSum(Integer.parseInt(start.toString()), Integer.parseInt(end.toString()));
            }
            System.out.println(count);
        }
    }
    private static int countPrimeDigitSum(int start, int end){
        //Set<Integer> numberSet = new HashSet<>();
        int count = 0;
        for (int num = start; num < end; num++) {       //for 100000 to 999999
            if(isThreeDigitSumIsPrime(num) && isFourDigitSumIsPrime(num) && isFiveDigitSumIsPrime(num)){
                count++;
                if(count>Math.pow(10,9)){
                    //count = count % (int) (Math.pow(10,9) + 7);
                    count = count % M;
                }
            }
        }
        return count;
    }
    private static boolean isThreeDigitSumIsPrime(int num){
        String numString = String.valueOf(num);
        int length= String.valueOf(num).length();
        for (int index = 0; index <= length-3; index++) {        //get all subString values
            int subNumber = Integer.parseInt(numString.substring(index,  index+3));
            if(!isPrimeImproved(getDigitSum(subNumber))){
                return false;
            }
        }
        return true;
    }
    private static boolean isFourDigitSumIsPrime(int num){
        String numString = String.valueOf(num);
        int length= String.valueOf(num).length();
        for (int index = 0; index <= length-4; index++) {        //get all subString values
            int subNumber = Integer.parseInt(numString.substring(index,  index+4));
            if(!isPrimeImproved(getDigitSum(subNumber))){
                return false;
            }
        }
        return true;
    }
    private static boolean isFiveDigitSumIsPrime(int num){
        String numString = String.valueOf(num);
        int length= String.valueOf(num).length();
        for (int index = 0; index <= length-5; index++) {        //get all subString values
            int subNumber = Integer.parseInt(numString.substring(index,  index+5));
            if(!isPrimeImproved(getDigitSum(subNumber))){
                return false;
            }
        }
        return true;
    }
    private static int getDigitSum(int num){
        int sum = 0;
        while(num>0){
            sum += num%10;
            num = num/10;
        }
        return sum;
    }
    private static boolean isPrime(int num){
        for (int i = 2; i*i < num; i++) {
            if(num%i!=0){
                return false;
            }
        }
        return true;
    }
    private static boolean isPrimeImproved(int num){
        if (num < 2) return false;
        if (num == 2) return true;
        if (num % 2 == 0) return false;
        for (int i = 3; i * i <= num; i += 2)
            if (num % i == 0) return false;
        return true;
    }

}
