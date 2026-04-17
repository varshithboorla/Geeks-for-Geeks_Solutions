/*
Definition for Linked List
class Node{
    int data;
    Node next;
    Node(int a){  data = a; next = null; }
}
*/
class Solution {
    public int getCount(Node head) {
        // code here
        if(head.next==null){
            return 1;
        }
        Node curr = head;
        int count=0;
        while(curr!=null){
            count++;
            curr = curr.next;
        }
        return count;
    }
}