/*
class Node
{
    int data;
    Node next;
    Node(int d) {
        data = d;
        next = null;
    }
}
*/

class Solution {
    Node sortedMerge(Node head1, Node head2) {
        // code here
        Node h1 = new Node(0);
        Node t = h1;
        Node curr1 = head1;
        Node curr2 = head2;
        while(curr1!=null&&curr2!=null){
            if(curr1.data>curr2.data){
                Node temp = new Node(curr2.data);
                t.next = temp;
                t = t.next;
                curr2 = curr2.next;
            }else{
                Node temp = new Node(curr1.data);
                t.next = temp;
                t = t.next;
                curr1 = curr1.next;
            }
            
        }
        
        while(curr1!=null){
            Node temp = new Node(curr1.data);
            t.next = temp;
            t = t.next;
            curr1 = curr1.next;
        }
        while(curr2!=null){
            Node temp = new Node(curr2.data);
            t.next = temp;
            t = t.next;
            curr2 = curr2.next;
        }
        return h1.next;
    }
}