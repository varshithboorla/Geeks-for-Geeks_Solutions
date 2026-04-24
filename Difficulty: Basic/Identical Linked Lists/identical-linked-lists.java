/*
class Node {
    int data;
    Node next;

    public Node(int data){
        this.data = data;
        this.next = null;
    }
}*/
class Solution {
    public boolean areIdentical(Node head1, Node head2) {
        // code here
        Node c1 = head1;
        Node c2 = head2;
        while(c1!=null&&c2!=null){
            if(c1.data!=c2.data) return false;
            c1 = c1.next;
            c2 = c2.next;
        }
        if(c1!=null || c2!=null){
            return false;
        }
        
        return true;
    }
}