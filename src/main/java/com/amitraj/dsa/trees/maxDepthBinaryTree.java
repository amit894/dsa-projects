package main.java.com.amitraj.dsa.arrays;

public class maxDepthBinaryTree {

    Node root;

    maxDepthBinaryTree(){
        this.root = null;
    }

    private  class Node{
        int value;
        Node left;
        Node right;

        Node (int value){
            this.value=value;
            this.left =null;
            this.right = null;
        }

    }

    private int maxDepthBinaryTree(Node root){
        if (root==null)
            return 0;
        else return (1+ Math.max(maxDepthBinaryTree(root.left),maxDepthBinaryTree(root.right)));

    }

    }

