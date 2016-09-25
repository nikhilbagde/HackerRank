package DataStructure.DoubleLinkedList;

/**
 * Created by Nikhil on 8/17/2016.
 */
public class DoublyLinkedList {
    Node head, tail;


    public static void main(String[] args) {
        DoublyLinkedList list1 = new DoublyLinkedList();

        System.out.println("Before Adding 5");
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(6);
        list1.add(7);

        list1.printList();
        System.out.println("After Adding 5");
        list1.SortedInsert(list1.head , 8);

        list1.printList();


        DoublyLinkedList list2 = new DoublyLinkedList();
        list2.SortedInsert(list2.head, 2);
        list2.printList();

    }
    Node SortedInsert(Node head,int data) {
        if(head==null){
            Node temp = new Node(data);
            this.head = temp;
            return head;
        }else{
            Node temp = this.head;
            Node prev = null;
            while(temp!=null && !(data<=temp.data)){
                prev = temp;
                temp = temp.next;
            }
            Node newNode = new Node(data);
            newNode.next = temp;
            newNode.prev = prev;

            prev.next = newNode;
            temp.prev = newNode;
            return head;

        }

    }
    public void add(int data){
        if(head == null){
            Node node = new Node(data);
            head = node;
        }else{
            Node node = new Node(data);
            Node temp = head;
            while (temp.next!=null){
                temp = temp.next;
            }
            temp.next = node;
            node.prev = temp;
        }
    }
    public void printList(){

        Node node = head;
        while(node!=null){
            System.out.print(node.data + "->");
            node = node.next;
        }
        System.out.println("NULL");
    }

}
