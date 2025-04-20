
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
    public int maxDepth(TreeNode root) {
        int count=0;
        ArrayDeque<TreeNode> queue=new ArrayDeque<>();
        if(root!=null){
            queue.offer(root);
            while(!queue.isEmpty()){
                int size=queue.size();
                for(int i=0;i<size;i++){
                TreeNode treeNode=queue.poll();
                if(treeNode.left!=null){
                    queue.offer(treeNode.left);
                } if(treeNode.right!=null){
                    queue.offer(treeNode.right);
                }
                }
                System.out.println(count);
                count++;

            }
        }
        return count;
    }
}