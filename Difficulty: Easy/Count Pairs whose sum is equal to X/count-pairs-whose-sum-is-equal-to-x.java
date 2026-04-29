// your task is to complete this function

/*class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}*/

class Solution {
    // Function to count pairs in two linked lists whose sum is equal to x
    public int countPairs(Node head1, Node head2, int x) {
        // add your code here
        Set<Integer> s = new HashSet<>();
        Node curr = head1;
        while(curr!=null){
            s.add(curr.data);
            curr = curr.next;
        }
        curr = head2;
        int count=0;
        while(curr!=null){
            if(s.contains(x-curr.data)){
                count++;
            }
            curr = curr.next;
        }
        return count;
    }
}