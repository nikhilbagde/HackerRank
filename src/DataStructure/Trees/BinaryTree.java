package DataStructure.Trees;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * Created by Nikhil on 9/14/2016.
 */
public class BinaryTree {
    private Node root;

    BinaryTree(){
        root = null;
    }
    BinaryTree(int data){
        root = new Node(data);
    }

    public Node getRoot() {
        return root;
    }

    public void insert(int data){
        if(root == null){
            root = new Node(data);
        }else {
            root = insertRec(root, data);
        }
    }

    private Node insertRec(Node root, int data){
        if(data < root.data){
            if(root.left == null){
                root.left = new Node(data);
            }else{
                root.left = insertRec(root.left, data);
            }
        }else if( data > root.data){
            if(root.right == null){
                root.right = new Node(data);
            }else{
                root.right = insertRec(root.right, data);
            }
        }else{
            //Do nothing when data == root.data.
            System.out.println("Can not add duplicated values into the tree!");
        }
        return root;
    }

    // https://www.hackerrank.com/challenges/tree-top-view
    void goLeft(Node node){
        if(node.left != null){
            goLeft(node.left);
        }
        System.out.print(node.data + " ");
    }
    void goRight(Node node){
        System.out.print(node.data + " ");
        if(node.right != null){
            goRight(node.right);
        }
    }
    void top_view(Node root){
        if(root.left != null){
            goLeft(root.left);
        }
        System.out.print(root.data + " ");

        if(root.right != null){
            goRight(root.right);
        }
    }

    //https://www.hackerrank.com/challenges/tree-preorder-traversal
    void preOrder(Node root) {
        System.out.print(root.data + " ");
        if(root.left!=null){
            preOrder(root.left);
        }
        if(root.right!=null){
            preOrder(root.right);
        }
    }

    //https://www.hackerrank.com/challenges/tree-postorder-traversal/submissions/code/27943957
    void postOrder(Node root) {
        if(root!=null){
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data + " ");
        }
    }

   //https://www.hackerrank.com/challenges/tree-inorder-traversal
    void inOrder(Node root) {
        if(root!=null){
            inOrder(root.left);
            System.out.print(root.data + " ");
            inOrder(root.right);
        }

    }

    //https://www.hackerrank.com/challenges/tree-height-of-a-binary-tree
    int height(Node root){
        if(root == null){
            return -1;  //-1 since when there is no root, height is nothing
                        // when root is there, means height is zero.
        }else{
            //int leftH = height(root.left);
            //int rightH = height(root.right);
            //System.out.print(leftH + "\n" + rightH);
            return 1 + Math.max(height(root.left), height(root.right));
        }

    }

    //https://www.hackerrank.com/challenges/tree-level-order-traversal

    public void levelOrder(Node root)
    {
        /* printLevelorder(tree)
        1) Create an empty queue q
        2) temp_node = root //start from root
        3) Loop while temp_node is not NULL

        a) print temp_node->data.
        b) Enqueue temp_node’s children (first left then right children) to q
        c) Dequeue a node from q and assign it’s value to temp_node
    */
        // We can use array implementation of queue too, here I have used linked list.
        // Its easy b/c I don't have to specify length as in case of array

        Queue<Node> queue = new LinkedList<Node>();
        queue.add(root);

        while(!queue.isEmpty()){
            // Poll() is used for remove element from queue.
            // Read your java collection framework notes for detail.
            Node tempNode = queue.poll();
            System.out.print(tempNode.data + " ");

            if(tempNode.left != null){
                queue.add(tempNode.left);
            }
            if(tempNode.right != null){
                queue.add(tempNode.right);
            }
        }

    }

    public void inOrderUsingStack(Node root){
        if(root == null){
            return;
        }
        //Step 1 : Create a stack
        Stack<Node> stack = new Stack<>();

        //Step 2: Create a temp node which points to root
        //          and keep adding to stack till you reach leftmost node
        Node node = root;
        while(node!= null){
            stack.add(node);
            node = node.left;
        }

        //Step 3: now, Start popping from stack
        //          and print out node value
        //          and then check if this left most node has right node,
        //          if yes, then again add those right nodes to stack.
        //          Like step 2 till leftmost node again.
        while(stack.size() > 0){
            node = stack.pop();
            System.out.println(node.data + " ");

            //3.a reach to right node of left most node
            if(node.right!=null){
                node = node.right;
            }
            //3.b Now considering this node as root again,
            //      go to its left most node
            while(node!=null){
                stack.add(node);
                node = node.left;
            }
        }
    }

    // Size of tree
    public int size(Node root){
        if(root == null){
            return 0;
        }else{
            return ( 1 + size(root.left) + size(root.right));
        }
    }

    //check if two trees are identical
    public boolean isIdentical(Node root1, Node root2){
        if(root1 == null && root2 == null){
            return true;
        }
        if(root1 !=null && root2!= null){
            return (root1.data == root2.data
                        && isIdentical(root1.left, root2.left)
                        && isIdentical(root1.right, root2.right));
        }
        return false;
    }

    //http://www.geeksforgeeks.org/given-a-binary-tree-print-out-all-of-its-root-to-leaf-paths-one-per-line/
    //Print path length from root to all leaf nodes
    public void printPath(Node root){
        int counter = 0;
        int path[] = new int[100];
        printPathRec(root, path, counter);
    }

    public void printPathRec(Node root, int path[], int counter){
        if(root == null){
            return;
        }else{
            //Now keep tracking data while going from root to left most node
            path[counter] = root.data;
            counter++;
            //check if we reached leaf node vai recursion
            if(root.left == null && root.right == null){
                //Print this path. Calling overloaded function.
                printPath(path, counter);
            }else{
                //Try both substrees
                printPathRec(root.left, path, counter);
                printPathRec(root.right, path, counter);
            }
        }
    }

    public void printPath(int path[], int counter){
        for (int i = 0; i < counter; i++) {
            System.out.print(path[i] + " ");
        }
        System.out.println();
    }

    public int leafCount(){
        return getLeafCount(root);
    }

    public int getLeafCount(Node node){
        if(node == null){
            return 0;
        }
        //we found leaf node return 1
        if(node.left == null && node.right == null){
            return 1;
        }else{
            return getLeafCount(node.left) + getLeafCount(node.right);
        }
    }
    public int maxDepth(Node A) {
        return depth(A, 0);
    }

    public int depth(Node node, int level) {

        if (node == null)
            return level;

        int left = depth(node.left, level + 1);
        int right = depth(node.right, level + 1);

        return Math.max(left, right);

    }

}
