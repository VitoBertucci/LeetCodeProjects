package BinaryTrees;
import JavaClasses.TreeNode;
//Subtree of Another Tree
public class IsSubtree {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null && q == null) {
            return true;
        } else if(p == null || q == null) {
            return false;
        }

        if(p.val == q.val) {
            return isSameTree(p.right, q.right) && isSameTree(p.left, q.left);
        }
        return false;
    }

    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if (subRoot == null) {
            return true;
        }

        if (root ==null) {
            return false;
        }

        if(isSameTree(root, subRoot)) {
            return true;
        } else {
            return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
        }
    }
}
