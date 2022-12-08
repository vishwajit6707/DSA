// Leaf-Similar Trees.
// Leetcode Link - https://leetcode.com/problems/leaf-similar-trees/

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
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        ArrayList<Integer> al1 = new ArrayList<>();
        ArrayList<Integer> al2 = new ArrayList<>();
        check(root1,al1);
        check(root2,al2);
        if(al1.size()!=al2.size()) return false;
        for(int i = 0; i<al1.size() ; i++){
            if(al1.get(i) != al2.get(i)) return false;
        }
        return true;
    }
    public void check(TreeNode root, ArrayList<Integer> al){
        if(root == null) return;
        if(root.left == null && root.right == null) al.add(root.val);
        if(root.left != null){
            check(root.left,al);
        }
        if(root.right != null){
            check(root.right,al);
        }
    }
}
