/*
Definition for Node
class Node {
    int data;
    Node left, right;

    Node(int d)
    {
        data = d;
        left = right = null;
    }
}
*/

class Solution {
    public boolean isBalanced(Node root) {
        // code here
        return hep(root)!=-1;
    }
    int hep(Node node){
        if(node==null) return 0;
        int left = hep(node.left);
        if(left == -1) return -1;
        
        int right = hep(node.right);
        if(right == -1) return -1;
        
        if(Math.abs(left - right)>1) return -1;
        return 1+Math.max(left,right);
    } 
}