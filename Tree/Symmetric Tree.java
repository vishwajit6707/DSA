// Symmetric Tree.
// Leetcode Link - https://leetcode.com/problems/symmetric-tree/

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isSymmetric(TreeNode root) {
        return helper(root,root);
    }
    public boolean helper(TreeNode rootL,TreeNode rootR){
        if(rootR == null && rootL == null) return true;
        if(rootR == null || rootL == null || rootL.val != rootR.val) return false;
        return helper(rootL.left,rootR.right) && helper(rootL.right,rootR.left);

    }
}
