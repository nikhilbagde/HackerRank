package GeeksForGeeks.Java.Random3;

import GeeksForGeeks.Java.Random2.ScoreTest;
/**
 * Created by Nikhil on 1/7/2017 2:22 AM.
 */
public class ScopeTestChild extends ScoreTest {
    public static void main(String[] args) {
        System.out.println(protectedVariable);
    }
}
