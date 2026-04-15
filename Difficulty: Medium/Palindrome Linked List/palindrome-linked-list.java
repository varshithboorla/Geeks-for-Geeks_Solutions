/*
class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}*/

class Solution {
    public boolean isPalindrome(Node head) {
        if(head.next == null) return true;
        // code here
        Node curr = head;
        Node nex = head;
        while(nex!=null&&nex.next!=null){
            curr = curr.next;
            nex = nex.next.next;
        }
        Node prev = null;
        while(curr!=null){
            nex = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nex;
        }
        curr = head;
        nex = prev;
        while(nex!=null&&curr!=nex){
            if(curr.data!=nex.data){
                return false;
            }
            curr = curr.next;
            nex = nex.next;
        }
        return true;
    }
}