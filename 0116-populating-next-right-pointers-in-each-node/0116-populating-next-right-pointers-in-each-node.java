/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node connect(Node root) {
        ArrayDeque<Node> queue=new ArrayDeque<>();
        Node node=null;
        boolean left=false;
        if(root!=null){
            queue.add(root);
            while(!queue.isEmpty()){
                int size=queue.size();
                for(int i=0;i<size;i++){
                     node=queue.poll();
                    if(node.left!=null){
                        queue.add(node.left);
                    }if(node.right!=null){
                        queue.add(node.right);
                    }
                     node.next=queue.peek();

                }
                node.next=null;
            }
        }
        return root;
    }
}