/*
class Node {
   int data;
   Node next;

  Node(int data) {
      this.data = data;
  }
}
*/
class Solution {
    Node rev(Node head){
        Node curr = head;
        Node prev = null;
        while(curr!=null){
            Node nex = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nex;
        }
        return prev;
    }
    Node compute(Node head) {
        // your code here
        if(head.next == null) return head;
        Node h = rev(head);
        Node curr = h;
        Node pr = h.next;
        while(pr!=null){
            if(pr.data<curr.data){
                pr = pr.next;
            }else{
                curr.next = pr;
                curr = curr.next;
                pr = pr.next;
            }
        }
        curr.next = null;
        return rev(h);
    }
}