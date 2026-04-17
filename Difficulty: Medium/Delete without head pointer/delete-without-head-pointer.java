/*
class Node
{
    int data ;
    Node next;
    Node(int d)
    {
        data = d;
        next = null;
    }
}
*/

class Solution {
    public void deleteNode(Node d) {
        // code here
        d.data = d.next.data;
        d.next = d.next.next;
    }
}