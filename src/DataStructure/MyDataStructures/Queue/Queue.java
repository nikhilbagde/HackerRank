package DataStructure.MyDataStructures.Queue;

/**
 * Created by Nikhi on 12/14/2016 5:01 AM.
 */
public interface Queue<E> {
    //update methods
    public abstract void enqueue(E e);
    public abstract E dequeue();

    //Accessor Methods
    public abstract E first();
    public abstract int size();
    public abstract boolean isEmpty();

    //
    public boolean offer(E e);
    public E poll();
}
