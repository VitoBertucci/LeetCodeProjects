package BinaryTrees;
import JavaClasses.TreeNode;
//Max Depth of Binary Tree
public class MaxDepth {
    TreeNode root;
    public int maxDepth(TreeNode root) {
        if(root==null)
        return 0;
        int leftDepth = maxDepth(root.left);
        int rightDepth = maxDepth(root.right);
        int bigger = Math.max(leftDepth, rightDepth);
        return bigger+1;
    }
}
