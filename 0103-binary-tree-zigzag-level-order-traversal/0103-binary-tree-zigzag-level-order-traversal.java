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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result=new ArrayList<>();
        ArrayDeque<TreeNode> queue=new ArrayDeque<>();
        if(root!=null){
        queue.add(root);
        boolean rev=false;
        while(!queue.isEmpty()){
            int size=queue.size();
            List<Integer> smallResult=new ArrayList<>();
            for(int i=0;i<size;i++){
                TreeNode node=queue.poll();
                smallResult.add(node.val);
                
                    System.out.println("Left First");
                    if(node.left!=null){
                        queue.add(node.left);
                    }if(node.right!=null){
                        queue.add(node.right);
                    }
            }
            if(rev) Collections.reverse(smallResult);
            result.add(smallResult);
            rev=!rev;
        }
        }
        return result;
    }
}