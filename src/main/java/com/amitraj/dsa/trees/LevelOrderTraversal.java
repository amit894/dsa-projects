package main.java.com.amitraj.dsa.trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LevelOrderTraversal {

    Node root;

    private class Node {
        Integer value;
        Node left;
        Node right;

        Node (int value)
        {
            this.value = value;
            this.left = null;
            this.right = null;
        }

    }

    ArrayList<List<Integer>> LevelOrderTraversal( Node root ){

        ArrayList<List<Integer>> result= new ArrayList<>();
        Queue<Node> queue= new LinkedList<>();

        if ( root == null)
            return null;

        queue.add(root);

        while (!queue.isEmpty()){
            int size = queue.size();
            List<Integer> temp = new ArrayList<>();

            for ( int i =0; i<size; i++){
                Node temp_node = queue.poll();
                if (temp_node.left!=null)
                    queue.add(temp_node.left);
                if (temp_node.right!=null)
                    queue.add(temp_node.right);
                temp.add(temp_node.value);

            }
            result.add(temp);
        }

     return result;
    }
}
