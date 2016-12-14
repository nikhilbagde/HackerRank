package DataStructure.MyDataStructures.Queue;

import DataStructure.LinkedList.LinkedList;

/**
 * Created by Nikhi on 12/14/2016 6:40 AM.
 */
public class LinkedListQueue<E> implements Queue<E> {
    private java.util.LinkedList<E> linkedList;
    LinkedListQueue(){
        linkedList = new java.util.LinkedList<E>();
    }

    @Override
    public void enqueue(E e) {
        linkedList.addLast(e);
    }

    @Override
    public E dequeue() {
        return linkedList.removeFirst();
    }

    @Override
    public E first() {
        return linkedList.peekFirst();
    }

    @Override
    public int size() {
        return linkedList.size();
    }

    @Override
    public boolean isEmpty() {
        return linkedList.isEmpty();
    }

    @Override
    public boolean offer(E e) {
        this.enqueue(e);
        return true;
    }

    @Override
    public E poll() {
        return this.dequeue();
    }
}
