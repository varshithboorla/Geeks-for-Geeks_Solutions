/*
class Node {
    int data;
    Node next;

    Node(int d)
    {
        data = d;
        next = null;
    }
}*/

class Solution {
    public Node segregate(Node head) {
        // code here
        int zero = 0 ,one = 0,two = 0;
        Node curr = head;
        while(curr!=null){
            int c = curr.data;
            if(c == 0){
                zero++;
            }else if(c==1){
                one++;
            }else if(c==2){
                two++;
            }
            curr = curr.next;
        }
        curr = head;
        while((zero > 0 || one > 0 || two > 0)&&curr!=null){
            if(zero > 0){
                curr.data = 0;
                zero--;
            }else if(one > 0){
                curr.data = 1;
                one--;
            }else if(two > 0){
                curr.data = 2;
                two--;
            }
            curr = curr.next;
        }
        return head;
    }
}