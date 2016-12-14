package DataStructure.MyDataStructures.Stacks;

import java.util.Arrays;

/**
 * Created by Nikhi on 12/14/2016 2:26 AM.
 */
public class ArrayStack<E> implements Stack<E> {
    private static final int CAPACITY = 1000;
    private E[] data;
    private int t;

    ArrayStack(){
        this(CAPACITY);
    }
    ArrayStack(int capacity){
        data = (E[]) new Object[capacity];
        t = -1;
    }

    @Override
    public int size() {
        return (t+1);
    }

    @Override
    public boolean empty() {
        return (t == -1);
    }

    @Override
    public void push(E e) {
        if(size() == data.length) throw new IllegalStateException("Stack is Full");
        data[++t] = e;
    }

    @Override
    public E pop() {
        if(t == -1) return null;
        E value = data[t];
        data[t] = null;
        t--;
        return value;
    }


    @Override
    public E peek() {
        if(t == -1) {
            System.out.println("Empty!");
            return null;
        }
        return data[t];
    }

    /*
        Bracket Matching function for stack
     */
    public static boolean hasMatchingBrackets(String expression){
        final String opening = "{[(";
        final String closing = "}])";
        Stack<Character> stack = new ArrayStack<>(expression.length());

        for (char c : expression.toCharArray()) {
            if(opening.indexOf(c)!=-1){
                stack.push(c);
            }else if(closing.indexOf(c)!= -1){
                if(stack.empty()){
                    return false;
                }
                if (closing.indexOf(c)!= opening.indexOf(stack.pop())){
                    return false;
                }
            }
        }
        return stack.empty();
    }
    static boolean matchHTMLTags(String html){
        Stack<String> stack = new ArrayStack<>();   //notice default length of 1000. (Drawback)
        int start = html.indexOf('<');              //get first index of '<' character if any
        while(start!=-1){
            int end = html.indexOf('>', start+1); //find '>' after '<'
            if(end == -1) return false;           //clearly not balanced.

            String tagName = html.substring(start+1, end);      //e.g.body

            if(!tagName.startsWith("/")){           //meaning its a start Tag. Push
                stack.push(tagName);
            }else{  //meaning it is a end tag with /at start.
                if(stack.empty()) return false;     //before me find match stack is empty. Not balanced.

                if(!tagName.substring(1).equals(stack.pop())){  //get tagName of end without '/' hence subString(1)
                    return false;
                }
            }
            start = html.indexOf('<', end+1);
        }
        return stack.empty();
    }

    @Override
    public String toString() {
        return "ArrayStack{" +
                "data=" + Arrays.toString(data) +
                ", t=" + t +
                '}';
    }
}