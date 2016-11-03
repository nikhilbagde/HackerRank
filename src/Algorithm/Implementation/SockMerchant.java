package Algorithm.Implementation;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by Nikhi on 10/1/2016.
 * What is difference between HashMap and HashTable
 * Hashmap not synchronized and can allow null values,
 * where as hashtable synchronised and does not allow null values or keys.
 */
public class SockMerchant {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int totalNumberofSocks = in.nextInt();
        int sockArray[] = new int[totalNumberofSocks];
        for(int c_i=0; c_i < totalNumberofSocks; c_i++){
            sockArray[c_i] = in.nextInt();
        }

        int matchingPairs = getMactchingPair(sockArray);
        System.out.println("He will be able to sell " + matchingPairs + " number of paris");

    }
    public static int getMactchingPair(int [] sockArray){
        // Choice HashMao or HashTable ?
        //What is difference between HashMap and HashTable
        //* Hashmap not synchronized and can allow null values,
        //* where as hashtable synchronised and does not allow null values or keys.
        Map<Integer,Integer> colorToCountMap = new HashMap<>();

        //1. put all elements from array and its count into a map
        for (int i = 0; i < sockArray.length ; i++) {
            if(!colorToCountMap.containsKey(sockArray[i])){
               colorToCountMap.put(sockArray[i],1);
            }else{
                colorToCountMap.put(sockArray[i],colorToCountMap.get(sockArray[i]) + 1);
            }
        }
        //2. find pairs and sum up all pairs and return total number of pairs he can sell.
        int numberOfPairs = 0;
        for (Integer count : colorToCountMap.values()) {
            numberOfPairs += count / 2;
        }
        return numberOfPairs;

    }
}
