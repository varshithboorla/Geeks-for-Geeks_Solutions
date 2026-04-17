/*
class Node
{
    int data;
    Node next;
}
*/

class Solution {
    public static void removeLoop(Node head) {
        if(head.next==null) return;
        // code here
        Node slow = head;
        Node fast = head;
        boolean isLoop = false;
        while(fast!=null&&fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow==fast){
                isLoop = true;
                break;
            }
        }
        if(isLoop){
            slow = head;
            while(slow!=fast){
                slow = slow.next;
                fast = fast.next;
            }
            while(fast.next!=slow) fast = fast.next;
            fast.next = null;
        }
    }
}