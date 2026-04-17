/*
class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }
*/

class Solution {
    Node removeDuplicates(Node head) {
        // code here
        if(head.next==null){
            return head;
        }
        Node curr = head;
        Node nex = head.next;
        while(nex!=null){
            if(curr.data == nex.data){
                curr.next = nex.next;
                nex = nex.next;
            }else{
                curr = curr.next;
                nex = nex.next;
            }
        }
        return head;
    }
}