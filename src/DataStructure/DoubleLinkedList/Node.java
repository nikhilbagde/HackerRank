package DataStructure.DoubleLinkedList;

/**
 * Created by Nikhil on 8/17/2016.
 */
public class Node {
    int data;
    Node next;
    Node prev;
    Node(int data){
        this.data = data;
        next = prev = null;
    }
}

