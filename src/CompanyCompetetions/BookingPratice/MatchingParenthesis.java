package CompanyCompetetions.BookingPratice;

import java.util.Stack;

/**
 * Created by Nikhi on 11/18/2016.
 * Write a function to test if the given set of brackets are balanced or not. e.g. {{}}{)([][]
 */
public class MatchingParenthesis {
    public static void main(String[] args) {
        String stream = "{{}}{)([][]";

        //this would work without letter in given stream
        //meaning only brackets.
        System.out.println(checkMatchingParenthesis(stream.toCharArray()));
    }
    public static boolean checkMatchingParenthesis(char[] stream){
        Stack<Character> stack = new Stack<>();
        for (char c: stream) {
            if(checkOpeningBracket(c)){
                stack.push(c);
            }else if(checkClosingBracket(c)){
                if(stack.isEmpty()){
                    return false;
                }else{
                    //I can eliminate creating these two character and compare inplace.
                    //But for understanding.
                    char leftBracket = stack.pop();
                    char rightBracker = c;
                    if(!checkPair(leftBracket,rightBracker)){
                        return false;
                    }
                }
            }
        }
        return true;
    }
    public static boolean checkOpeningBracket(char c){
        return (c == '{' || c == '[' || c == '(');
    }
    public static boolean checkClosingBracket(char c){
        return (c == '}' || c == ']' || c == ')');
    }
    public static boolean checkPair(char left, char right){
        return (left == '(' && right == ')'
                || left == '{' && right == '}'
                || left == '[' && right == ']');
    }

}
