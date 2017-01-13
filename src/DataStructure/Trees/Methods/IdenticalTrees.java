package DataStructure.Trees.Methods;

import DataStructure.Trees.Node;

/**
 * Created by Nikhil on 1/11/2017 4:08 AM.
 */
public class IdenticalTrees {
    private static boolean isIdenticalTrees(Node root1, Node root2){
        if(root1 == null && root2 == null){
            return true;
        }
        if(root1!= null && root2!=null){
            return (root1.data == root2.data
            && isIdenticalTrees(root1.left,root2.left)
            && isIdenticalTrees(root1.right,root2.right));
        }
        return false;
    }
}
