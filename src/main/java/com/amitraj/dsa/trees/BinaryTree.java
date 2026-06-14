package main.java.com.amitraj.dsa.arrays;


import java.util.ArrayList;
import java.util.List;

public class BinaryTree {
    Node root;

    private  class Node{
        int value;
        Node left;
        Node right;

        Node  (int value){
            this.value = value;
            this.left = null;
            this.right = null;
        }

    }

    List<Integer> inOrderTraversal(){
        ArrayList<Integer> result = new ArrayList<>();
        inOrder(this.root,result);
        return result;
    };

    void inOrder(Node root, List<Integer> result){
        if (root==null)
            return;
        inOrder(root.left,result);
        System.out.println(root.value);
        result.add(root.value);
        inOrder(root.right,result);

    }
    List<Integer> postOrderTraversal(){
        ArrayList<Integer> result = new ArrayList<>();
        postOrder(this.root,result);
        return result;
    };

    void postOrder(Node root, List<Integer> result){
        if (root==null)
            return;
        postOrder(root.left,result);
        postOrder(root.right,result);
        System.out.println(root.value);
        result.add(root.value);
    }


    List<Integer> preOrderTraversal(){
        ArrayList<Integer> result = new ArrayList<>();
        preOrder(this.root,result);
        return result;
    };

    void preOrder(Node root, List<Integer> result){
        if (root==null)
            return;
        System.out.println(root.value);
        result.add(root.value);
        preOrder(root.left,result);
        preOrder(root.right,result);
    }


}
