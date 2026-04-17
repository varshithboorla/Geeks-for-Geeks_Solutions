/*
class Node {
    int data;
    Node next;

    Node(int d){
        data=d;
        next=null;
   }
}
*/

class Solution {
    public Node rotate(Node head, int k) {
        // code here
        int count = 0;
        Node curr = head;
        while(curr.next!=null){
            curr = curr.next;
            count++;
        }
        k%=count+1;
        if(k==0){
            return head;
        } 
        curr.next = head;
        curr = head;
        while(k>1){
            curr = curr.next;
            k--;
        }
        Node nex = curr.next;
        curr.next = null;
        return nex;
    }
}
