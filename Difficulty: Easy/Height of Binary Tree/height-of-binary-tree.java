/*
Definition for Node
class Node {
    int data;
    Node left, right;

    Node(int val)
    {
        data = val;
        left = right = null;
    }
}
*/

class Solution {
    public int height(Node root) {
        // code here
        return hep(root)-1;
    }
    int hep(Node node){
        if(node==null) return 0;
        return 1+Math.max(hep(node.left),hep(node.right));
    }
}