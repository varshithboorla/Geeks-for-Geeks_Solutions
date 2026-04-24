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
    Node compute(Node head) {
        // your code here
        if(head.next == null) return head;
        Stack<Integer> s = new Stack<>();
        Node curr = head;
        while(curr!=null){
            if(s.isEmpty()) s.push(curr.data);
            else{
                while(curr.data>s.peek()){
                    s.pop();
                    if(s.isEmpty()) break;
                }
                s.push(curr.data);
            }
            curr = curr.next;
        }
        Node d = new Node(s.pop());
        Node t = d;
        while(!s.isEmpty()){
            Node n = new Node(s.pop());
            n.next = t;
            t = n;
        }
        return t;
    }
}