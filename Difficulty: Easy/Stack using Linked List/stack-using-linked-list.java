// Node class
/* class Node {
    int data;
    Node next;

    Node(int new_data) {
        data = new_data;
        next = null;
    }
} */

// Stack class
class myStack {
    Node d;
    public myStack() {
        // Initialize your data members
        d = new Node(0);
    }
    
    public boolean isEmpty() {
        // check if the stack is empty
        if(d.next==null) return true;
        return false;
    }

    public void push(int x) {
        // Adds an element x at the rear of the stack.
        Node curr = d;
        Node temp = new Node(x);
        if(isEmpty()){
            curr.next = temp;
            curr = curr.next;
        }else{
            while(curr.next!=null){
                curr = curr.next;
            }
            curr.next = temp;
        }
    }

    public void pop() {
        // Removes the front element of the stack.
        if(isEmpty()) return;
        Node curr = d;
        while(curr.next.next!=null){
            curr = curr.next;
        }
        curr.next = null;
    }

    public int peek() {
        // Returns the front element of the stack.
        // If stack is empty, return -1.
        if(isEmpty()) return -1;
        Node curr = d;
        while(curr.next.next!=null){
            curr = curr.next;
        }
        return curr.next.data;
    }

    public int size() {
        // Returns the current size of the stack.
        if(isEmpty()) return 0;
        int size = 0;
        Node curr = d.next;
        while(curr!=null){
            size++;
            curr = curr.next;
        }
        return size;
    }
}
