package DataStructure.Trees.Methods;

import DataStructure.Trees.Node;

/**
 * Created by Nikhil on 1/11/2017 12:31 AM.
 */
public class TraversalOfTree {
    private static void preOrder(Node root){
        if(root != null){
            System.out.println(root.data + " ");
            if(root.left !=null){
                preOrder(root.left);
            }
            if(root.right != null){
                preOrder(root.right);
            }
        }
    }
    private static void postOrder(Node root){
        if(root!= null){
            postOrder(root.left);
            postOrder(root.right);
            System.out.println(root.data + " ");
        }
    }
    private static void inOrder(Node root){
        if(root!=null){
            inOrder(root.left);
            System.out.println(root.data + " ");
            inOrder(root.right);
        }
    }
}
