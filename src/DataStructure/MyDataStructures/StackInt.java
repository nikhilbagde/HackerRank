package DataStructure.MyDataStructures;

/**
 * Created by Nikhi on 12/13/2016 8:22 PM.
 */
public class StackInt {
    private int top;
    private int maxSize;
    private int[] elements;

    StackInt(int size){
        maxSize = size;
        elements = new int[maxSize];
        top = -1;
    }
    public void push(int element){
        if(isFull()) throw new StackOverflowError();
        elements[++top] = element;
    }
    public int pop(){
        if(isEmpty()) throw new StackOverflowError();
        return elements[top--];
    }
    public int peek(){
        return elements[top];
    }
    public boolean isEmpty(){
        return (top == -1);
    }
    public boolean isFull(){
        return (top == maxSize-1);
    }
}

