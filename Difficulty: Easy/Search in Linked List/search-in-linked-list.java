/*
  class Node {
   int data;
    Node next;

    Node(int d)  { data = d;  next = null; }
}
*/
class Solution {
    public boolean searchKey(Node head, int key) {
        // Code here
        Node curr = head;
        while(curr!=null){
            if(key==curr.data){
                return true;
            }
            curr = curr.next;
        }
        return false;
    }
}