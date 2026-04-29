/*class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }*/

// sortedInsert method should return the head of the modified linked list.
class Solution {
    Node sortedInsert(Node head, int key) {
        // Add your code here.
        if(head.data>key){
            Node d = new Node(key);
            d.next = head;
            return d;
        }
        Node curr = head;
        Node prev = head;
        while(curr!=null && curr.data<key){
            prev = curr;
            curr = curr.next;
        }
        if(prev.next==null){
            Node d = new Node(key);
            prev.next = d;
            return head;
        }
        Node d = new Node(key);
        d.next = prev.next;
        prev.next = d;
        return head;
    }
}