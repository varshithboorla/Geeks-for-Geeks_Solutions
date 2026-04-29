/* Node of a linked list
 class Node {
   int data;
    Node next;
    Node(int d)  { data = d;  next = null; }
}
*/

class Solution {
    public static Node findIntersection(Node head1, Node head2) {
        // code here.
        Node d = new Node(-1);
        Node nex = d;
        Node c1 = head1;
        Node c2 = head2;
        while(c1!=null&&c2!=null){
            
            if(c2.data>c1.data){
                c1 = c1.next;
            }else if(c2.data<c1.data){
                c2 = c2.next;
            }else{
                Node u = new Node(c1.data);
                c1 = c1.next;
                c2 = c2.next;
                nex.next = u;
                nex = nex.next;
            }
        }
        return d.next;
    }
}