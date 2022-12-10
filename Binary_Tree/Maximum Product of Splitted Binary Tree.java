// Maximum Product of Splitted Binary Tree.
// Leetcode Link - https://leetcode.com/problems/maximum-product-of-splitted-binary-tree/

// Time Complexity - O(N).    N - all nodes of tree.
// Space Complexity - O(H).   H - height of tree.

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
    long max = 0;
    long total = 0;
    public int maxProduct(TreeNode root) {
        total = tMax(root);  // calculate total sum of all tree nodes.
        tMax(root);           // find product of all tree nodes and max product.
        return (int) (max % (1e9 + 7));
    }
    public int tMax(TreeNode root){
        if(root == null) return 0;
        // Post Order traversal of each sub tree.
        int Csum = tMax(root.left) + tMax(root.right) + root.val;
        max = Math.max(max,(total - Csum)*Csum);
        return Csum;
    }
}
