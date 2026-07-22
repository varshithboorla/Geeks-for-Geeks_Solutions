/*
class Node {
    int data;
    Node left;
    Node right;

    Node(int val) {
        data = val;
        left = right = null;
    }
}
*/

class Solution {
    public boolean isBST(Node root) {
        // code here
        return hep(root,Long.MIN_VALUE,Long.MAX_VALUE);
    }
    boolean hep(Node node, long min,long max){
        if(node==null) return true;
        if(node.data>=max||node.data<=min) return false;
        return hep(node.left,min,node.data) && hep(node.right,node.data,max);
    }
}