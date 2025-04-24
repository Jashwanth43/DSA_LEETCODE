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
    public TreeNode invertTree(TreeNode root) {
        if(root!=null){
         rec(root);
        }
         return root;
    }
    public void rec(TreeNode node){
        if(node==null) return;
        rec(node.left);
        rec(node.right);
        TreeNode dummy =node.left;
        node.left=node.right;
        node.right=dummy;

    }
}