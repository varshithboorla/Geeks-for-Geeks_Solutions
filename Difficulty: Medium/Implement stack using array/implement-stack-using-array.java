class myStack {
    int[] arr;
    int i=-1;
    public myStack(int n) {
        // Define Data Structures
        arr = new int[n];
    }

    public boolean isEmpty() {
        // check if the stack is empty
        if(i==-1) return true;
        return false;
        
    }

    public boolean isFull() {
        // check if the stack is full
        if(i==arr.length-1)return true;
        return false;
    }

    public void push(int x) {
        // Inserts x at the top of the stack
        if(isFull()) return;
        arr[++i] = x;
    }

    public void pop() {
        // Removes an element from the top of the stack
        if(isEmpty()) return;
        i--;
    }

    public int peek() {
        // Returns the top element of the stack
        if(i==-1) return -1;
        return arr[i];
    }
}