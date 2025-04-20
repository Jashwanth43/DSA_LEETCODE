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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> result=new ArrayList<>();
        ArrayDeque<TreeNode> queue=new ArrayDeque<>();
        if(root!=null){
            queue.add(root);
            while(!queue.isEmpty()){
                int Size=queue.size();
                List<Integer> sResult=new ArrayList<>();
                for(int i=0;i<Size;i++){
                    TreeNode treeNode=queue.poll();
                    sResult.add(treeNode.val);
                    if(treeNode.left!=null){
                        queue.add(treeNode.left);
                    }if(treeNode.right!=null){
                        queue.add(treeNode.right);
                    }
                }
                result.add(sResult);
            }
        }
        Collections.reverse(result);
        return result;
    }
}