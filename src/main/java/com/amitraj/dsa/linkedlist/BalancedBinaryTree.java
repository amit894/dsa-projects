package main.java.com.amitraj.dsa.linkedlist;

public class BalancedBinaryTree {

    TreeNode root;

    private class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(){
            this.left= null;
            this.right = null;
            this.val = 0;
        }

    }

    public boolean isBalanced(TreeNode root){
        return(checkHeight(root)!=-1);
    }
    public int checkHeight(TreeNode root){
        if (root==null)
            return 0;
        int leftHeight = checkHeight(root.left);
        int rightHeight = checkHeight(root.right);

        if (leftHeight==-1) return  -1;
        if (rightHeight== -1) return  -1;

        if (Math.abs(leftHeight-rightHeight)>1)
            return -1;

        return (1+Math.max(leftHeight,rightHeight));


    };


}
