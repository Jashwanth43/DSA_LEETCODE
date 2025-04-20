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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> list=new ArrayList<>();
       ArrayDeque<TreeNode> queue = new ArrayDeque<>();
       if(root!=null){
       queue.add(root);
       while(!queue.isEmpty()){
        int size=queue.size();
        List<Integer> smallList=new ArrayList<>();
        for(int i=0;i<size;i++){
        TreeNode treeNode=queue.poll();
        smallList.add(treeNode.val);
        if(treeNode.left!=null){
            queue.add(treeNode.left);
        }if(treeNode.right!=null){
            queue.add(treeNode.right);
        }
        }
        list.add(smallList);
       }
       
       }
      return list;

    }
}