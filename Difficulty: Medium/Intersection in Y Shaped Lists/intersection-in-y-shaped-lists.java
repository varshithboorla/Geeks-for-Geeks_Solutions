/*
class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}
*/

class Solution {
    public Node intersectPoint(Node head1, Node head2) {
        // code here
        Node p1 = head1;
        Node p2 = head2;
        while(p1!=null||p2!=null){
            if(p1==p2){
                break;
            }
            if(p1==null){
                p1 = head2;
            }else if(p2==null){
                p2 = head1;
            }
            p1 = p1.next;
            p2 = p2.next;
        }
        return p1;
    }
}