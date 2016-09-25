package DataStructure.LinkedList;
import java.util.Hashtable;

/**
 * Created by Nikhil on 8/14/2016.
 */
public class LinkedList {
    Node head;

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add(1);         list.add(2);         list.add(3);         list.add(4);         list.add(5);
        list.add(6);         list.add(7);

        LinkedList list2 = new LinkedList();
        list2.add(1);         list2.add(2);        list2.add(3);         list2.add(4);         list2.add(5);
        list2.add(6);         list2.add(7);

        System.out.println("Before Swap node");
        list.printList();

        list.swapNodes(3,4);

        System.out.println("After Swap node");
        list.printList();

        System.out.println("Before Reverse");
        list.printList();

        list.reverse(list);

        System.out.println("After Reverse");
        list.printList();


        System.out.println("Merging Two Lists");
        LinkedList mergedList = new LinkedList();
        mergedList.head = list.mergeLists(list.head, list2.head);
        mergedList.printList();

        LinkedList list3 = new LinkedList();
        list3.add(1);         list3.add(2);         list3.add(3);         list3.add(4);         list3.add(5);         list3.add(6);
        list3.add(6);
        System.out.println("Testing LinkedList for Cycle");

        if(list3.hasCycle(list3.head)){
            System.out.println("No Cycle");
        }else{
            System.out.println("Cycle Exist");
        }


        /*Two linked list with merged node, find that node */
        LinkedList list4 = new LinkedList();
        list4.add(1); list4.add(2); list4.add(3); list4.add(4);
        LinkedList list5 = new LinkedList();
        list5.add(1); list5.head.next = list4.head.next.next;

        System.out.println("Finding Merge Node");
        int data = findMergeNode(list4.head, list5.head);
        System.out.println("Merged Node is " + data);

    }
    public static int findMergeNode(Node headA, Node headB) {
        Node tempA = headA;
        Node tempB = headB;
        int counterA = 0;
        while(tempA!=null){
            counterA++;
            tempA = tempA.next;
        }
        int counterB = 0;
        while(tempB!=null){
            counterB++;
            tempB = tempB.next;
        }

        if(counterA < counterB){
            tempA = headB;
            tempB = headA;
        }

        tempA = headA;
        tempB = headB;
        Node resetBackToHead = tempA;

        while(tempB!= null){
            tempA = resetBackToHead;
            while(tempA!=null){
                if(tempA == tempB){
                    return tempA.data;
                }
                tempA = tempA.next;
            }

            tempB = tempB.next;
        }
        return tempA.data;
    }

    public boolean hasCycle(Node head){
        Node temp = head;
        Hashtable<Node, Integer> linkedList = new Hashtable<>();
        while(temp!=null){
            //linkedList.put(temp, temp.hashCode());
            if(!linkedList.containsKey(temp)) {
                linkedList.put(temp, temp.hashCode());
                temp = temp.next;
            }else{
                return false;
            }
        }
        return true;
    }
    public Node mergeLists(Node headA, Node headB){

        if(headA == null){
            return headB;
        }else if(headB== null){
            return headA;
        }

        Node temp;
        if(headA.data <= headB.data){
            temp = headA;
            temp.next = mergeLists(headA.next, headB);
        }else{
            temp = headB;
            temp.next = mergeLists(headA, headB.next);
        }
        return temp;
    }
    public void reverse(LinkedList list){

        if(list.head == null){
            return;
        }else {
            Node current = list.head;
            Node previous = null;
            while(current!=null){
                //1. Store next pointer
                Node next = current.next;
                //2. Change next to previous
                current.next = previous;
                //3. move current to previous for all nodes
                previous = current;
                //4. move forward, (incrementer)
                current = next;
            }
            //5. At last we need to put head node to last node
            head = previous;
        }
    }
    public void swapNodes( int x, int y){
        if(x == y)
            return;

        /*
        Search for x and keep track of prev and current node.
         */
        Node prevX = null, currX = head;
        while (currX!= null && currX.data!=x){
            prevX = currX;
            currX = currX.next;
        }
        /*
        Search for y and keep track of prev and current node.
         */

        Node prevY = null, currY = head;
        while (currY!= null && currY.data!=y){
            prevY = currY;
            currY = currY.next;
        }

        if(currX==null  || currY== null){
            return ;
        }

        /*
        If either of node currX or CurrY is HEAD
        Otherwise, Take previous node of both nodes, and put each node to previous of Other node.
        Indirectly we are swapping previous node of both target nodes
        */
        if(prevX == null){
            head = currY;
        }else{
            prevX.next = currY;
        }

        if(prevY == null){
            head = currX;
        }else{
            prevY.next = currX;
        }

        /*
        Swap next pointers of both X and Y node
        */

        Node temp = currX.next;
        currX.next = currY.next;
        currY.next = temp;
    }
    public void add(int data){
        if(head== null){
            Node node = new Node(data);
            head = node;
        }else{
            Node node = new Node(data);
            Node temp = head;

            while(temp.next!=null){
                temp = temp.next;
            }
            temp.next = node;
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
