package main.java.com.amitraj.dsa.arrays;

import java.util.ArrayList;

public class BinaryTree {
    Node root;

    BinaryTree (){
        this.root= null;
    }

    private class Node{
        int value;
        Node left;
        Node right;

        Node (int value){
            this.value=value;
            this.left = null;
            this.right = null;
        }
    }

    ArrayList<Integer> inOrderTraversal(){
        ArrayList<Integer> result = new ArrayList<>();
        inOrder(result,root);
        return result;

    };

    void inOrder(ArrayList<Integer> result, Node root){
        if (root==null)
            return;
        inOrder(result,root.left);
        result.add(root.value);
        inOrder(result,root.right);
    };
    ArrayList<Integer> PreOrderTraversal(){
        ArrayList<Integer> result = new ArrayList<>();
        preOrder(result,root);
        return result;
    };

    void preOrder(ArrayList<Integer> result, Node root){
        if (root==null)
            return;
        result.add(root.value);
        preOrder(result,root.left);
        preOrder(result,root.right);

    };


    ArrayList<Integer> PostOrderTraversal(){
        ArrayList<Integer> result = new ArrayList<>();
        postOrder(result,root);
        return result;
    };

    void postOrder(ArrayList<Integer> result, Node root){
        if (root==null)
            return;
        postOrder(result,root.left);
        postOrder(result,root.right);
        result.add(root.value);

    };
}
