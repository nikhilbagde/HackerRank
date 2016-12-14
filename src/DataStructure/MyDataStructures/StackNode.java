package DataStructure.MyDataStructures;

/**
 * Created by Nikhi on 12/13/2016 8:35 PM.
 */
public class StackNode {
    private int maxSize;
    private int top;
    private Node[] elements;

    StackNode(int size){
        maxSize = size;
        elements = new Node[maxSize];
    }

    public int peek(){
        return elements[top].valueI;
    }
    public void push(int valueIn){
        Node node = new Node(valueIn);
        elements[++top] = node;
    }
    public int pop(){
        return elements[top--].valueI;
    }
    public boolean isEmpty(){
        return (top == -1);
    }
    public boolean isFull(){
        return (top == maxSize -1);
    }
}
class Node<T>{
    /*boolean valueB;
    char valueC;
    byte valueb;
    short valueS;*/
    int valueI;
    /*long valueL;
    float valueF;
    double valueD;
    T value;*/

    Node(int valueIn){
        /*valueB = false;
        valueC = 'a';
        valueb = 0;
        valueS = 0;*/
        valueI = valueIn;
        /*valueL = 0L;
        valueF = 0F;
        valueD = 0;
        value = null;*/
    }


}
