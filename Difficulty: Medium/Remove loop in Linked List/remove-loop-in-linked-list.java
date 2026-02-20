/*
class Node
{
    int data;
    Node next;
}
*/

class Solution {
    public static void removeLoop(Node head) {
        // code here
        Node slow = head;
        Node fast = head;
        boolean is = false;
        while(fast!=null&&fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow==fast){is=true; break;}
        }
        if(is){
            slow = head;
            while(fast!=slow){
                slow = slow.next;
                fast = fast.next;
            }
            while(fast.next!=slow) fast = fast.next;
            fast.next = null;
        }
        
        
    }
}