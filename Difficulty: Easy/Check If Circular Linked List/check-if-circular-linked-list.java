/*
class Node
{
    int data;
    Node next;
    Node(int d)
    {
        data = d;
        next = null;
    }
}
*/
class Solution {
    boolean isCircular(Node head) {
        // code here
        Node curr = head;
        while(curr!=null){
            curr = curr.next;
            if(curr==head){
                return true;
            }
        }
        return false;
    }
}