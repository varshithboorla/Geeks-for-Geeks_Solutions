/*
class Node{
    int data;
    Node next;

    Node(int x){
        data = x;
        next = null;
    }
}
*/

class Solution {
    Node reve(Node head){
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
    public Node addOne(Node head) {
        // code here.
        Node h2 = reve(head);
        Node curr = h2;
        int carry = 0;
        while(curr.next!=null&&curr.data>=9){
            if(curr.data == 9){
                curr.data = 0;
                carry = 1;
            }else{
                curr.data+=1;
                carry = 0;
            }
            curr = curr.next;
        }
        if(carry==0){
          curr.data+=1;  
        }else{
            if(curr.data==9){
                curr.data = 0;
                Node n = new Node(1);
                curr.next = n;
            }else{
                curr.data+=1;
            }
            
        }
        return reve(h2);
    }
}