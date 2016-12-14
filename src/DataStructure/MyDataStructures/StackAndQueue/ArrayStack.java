package DataStructure.MyDataStructures.StackAndQueue;

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
}