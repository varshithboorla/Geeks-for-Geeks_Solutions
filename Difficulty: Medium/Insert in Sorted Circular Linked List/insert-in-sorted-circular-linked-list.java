/*
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
} */

class Solution {
    public Node sortedInsert(Node head, int data) {
        // code here
        if(head.data>data){
            Node curr = head.next;
            while(curr.next!=head){
                curr = curr.next;
            }
            Node d = new Node(data);
            curr.next = d;
            d.next = head;
            return d;
        }
        Node curr = head.next;
        Node prev = head;
        while(curr!=head &&curr.data<data){
            prev = curr;
            curr = curr.next;
        }
        Node d = new Node(data);
        d.next = curr;
        prev.next = d;
        return head;
    }
}