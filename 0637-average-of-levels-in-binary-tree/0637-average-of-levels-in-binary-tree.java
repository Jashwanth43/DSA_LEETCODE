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
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> result=new ArrayList<>();
        ArrayDeque<TreeNode> queue=new ArrayDeque<>();
        if(root!=null){
            queue.add(root);
            while(!queue.isEmpty()){
                int size=queue.size();
                double val=0.0;
                for(int i=0;i<size;i++){
                    TreeNode treeNode=queue.poll();
                     val+=treeNode.val;
                     if(treeNode.left!=null){
                        queue.add(treeNode.left);
                     }if(treeNode.right!=null){
                        queue.add(treeNode.right);
                     }
                }
                double avg=val/size;
                result.add(avg);
            }
        }
        return result;
    }
}