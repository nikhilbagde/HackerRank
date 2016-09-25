package DataStructure.Arrays;
import java.util.Scanner;

/**
 * Created by Nikhil on 12/31/2015.
 */


public class DSArrays {
    public static void main(String args[]){
        int [] array = new int[10000];
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();

        for( int i=0; i<length; i++){
            array[i]= sc.nextInt();
        }
        for( int i=length-1;i>=0;i--){
            System.out.print(array[i] + " ");
        }





    }
}
/*
Problem Statement
An array is a series of elements of the same type placed in contiguous memory locations that can be individually referenced by adding an index to a unique identifier.
You'll be given an array of N integers, and you have to print the integers in reverse order.
Note: If you have already solved the problem "Arrays Introduction" in the Introduction chapter of the C++ domain, you may skip this challenge.

Input Format

The first line of input contains N, the number of integers. The next line contains N integers separated by a space.

Constraints

1<=N<=1000
1<=Ai<=10000, where Ai is the ith integer in the array.

Output Format

Print the N integers of the array in the reverse order on a single line separated by single spaces.

Sample Input

4
1 4 3 2
Sample Output

2 3 4 1
 */