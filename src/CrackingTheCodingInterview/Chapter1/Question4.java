package CrackingTheCodingInterview.Chapter1;

/**
 * Created by Nikhi on 10/26/2016.
 */
public class Question4 {
    public static void main(String[] args) {
        String str = "abc d e f";
        replaceSpace(str.toCharArray(), str.length());
        String str1 = str.replaceAll("\\s+","%20");
        String str2 = str.replaceAll("\\s", "a");

        System.out.println(str1);

    }
    public static void replaceSpace(char [] arr, int length){
        //Put counter for space count
        int spaceCount = 0;
        for (char a: arr) {
            if(a == ' '){
                spaceCount++;
            }
        }
        int totalLength =  length + spaceCount *2 + 1;
    }
}
