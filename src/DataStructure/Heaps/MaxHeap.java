package DataStructure.Heaps;

/**
 * Created by Nikhi on 12/8/2016 7:16 PM.
 */
public class MaxHeap {
    private int capacity = 10;
    private int size = 0;
    private int[] items = new int[capacity];

    private  void ensureCapacity(){
        if(size == capacity){
            items = java.util.Arrays.copyOf(items, capacity*2);
            capacity = capacity *2;
        }
    }
    /*private int getLeftChildIndex(int index){return index*2+1};
    private int getRightChildIndex(int index){return index*2+2};
    private int getParentIndex(int index){return (index-1)/2};
    */
    private int poll(){
        if(size==0) throw new IllegalArgumentException();
        int item = items[0];
        items[0] = items[size-1];
        size--;
        return item;
    }
    private void add(int item){
        ensureCapacity();
        items[size] = item;
        size++;
        heapifyUp();
    }
    private void heapifyUp(){

    }
    private void heapifyDown(){

    }

    public static void main(String[] args) {
        MaxHeap heap = new MaxHeap();
        heap.add(3);
    }

}
