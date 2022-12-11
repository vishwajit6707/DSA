// Binary Tree Maximum Path Sum.
// Leetcode Link - https://leetcode.com/problems/binary-tree-maximum-path-sum/

// Time Complexity - O(N).
// Space Complexity - O(N). due to recursive call.

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
    int max;
    public int maxPathSum(TreeNode root) {
        max = Integer.MIN_VALUE;
        travel(root);
        return max;
    }
    public int travel(TreeNode root){
        if(root == null) return 0;
        int leftS = Math.max(travel(root.left) , 0);
        int rightS = Math.max(travel(root.right) , 0);
        max = Math.max((leftS + rightS + root.val),max);
        return Math.max((leftS+root.val) ,(rightS + root.val));
    }
}
