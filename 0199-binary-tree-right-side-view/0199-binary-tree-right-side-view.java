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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> result=new ArrayList<Integer>();
        Queue<TreeNode> q=new ArrayDeque<>();
    if(root!=null){
        q.add(root);
    }
        while(!q.isEmpty()){
            int size=q.size();
            for(int i=0;i<size;i++){
                root=q.poll();
                if(root.left!=null){
                    q.add(root.left);
                }
                 if(root.right!=null){
            q.add(root.right);
           }

            }
           result.add(root.val);
          
        }
        return result;
    }
}