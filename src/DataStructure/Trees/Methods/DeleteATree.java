package DataStructure.Trees.Methods;

import DataStructure.Trees.Node;

/**
 * Created by Nikhil on 1/12/2017 1:47 AM.
 */
public class DeleteATree {
    private static void deleteTree(Node node){
        if(node == null){
            return;
        }
        deleteTree(node.left);
        deleteTree(node.right);

        System.out.println("Deleted Node is" + node.data);
        node = null;
    }
}
