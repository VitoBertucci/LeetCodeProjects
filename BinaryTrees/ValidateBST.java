package BinaryTrees;
import JavaClasses.TreeNode;
//Validate Binary Search Tree
public class ValidateBST {

    public boolean isValidBST(TreeNode root) {
        return isValid(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }
    
    private boolean isValid(TreeNode root, long min, long max) {
        if(root == null){
            return true;
        }
        
        boolean left = isValid(root.left, min, root.val);
        boolean right = isValid(root.right, root.val, max);

        if(!left || !right) {
            return false;
        } 

        return inRange(min, root.val, max);
    }

    private boolean inRange(long min, long mid, long max) {
        return mid>min && mid<max;
    }
}
