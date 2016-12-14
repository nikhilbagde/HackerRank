package DataStructure.MyDataStructures.StackAndQueue;

/**
 * Created by Nikhi on 12/14/2016 2:23 AM.
 */
public interface Stack<E> {
    public void push(E e);
    public E pop();
    public int size();
    public boolean empty();
    public E peek();

}
