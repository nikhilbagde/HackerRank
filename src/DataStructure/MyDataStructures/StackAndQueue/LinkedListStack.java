package DataStructure.MyDataStructures.StackAndQueue;

import DataStructure.LinkedList.LinkedList;

import java.util.List;

/**
 * Created by Nikhi on 12/14/2016 2:50 AM.
 */
public class LinkedListStack<E> implements Stack<E> {
    private java.util.LinkedList<E> linkedList = new java.util.LinkedList<E>();
    @Override
    public void push(E e) {
        linkedList.addFirst(e);
    }

    @Override
    public E pop() {
        return linkedList.removeFirst();
    }

    @Override
    public int size() {
        return linkedList.size();
    }

    @Override
    public boolean empty() {
        return linkedList.isEmpty();
    }

    @Override
    public E peek() {
        return linkedList.peekFirst();
    }
}
