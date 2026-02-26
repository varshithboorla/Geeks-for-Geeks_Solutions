class SpecialStack {
    Stack<Integer> stack;
    Stack<Integer> min;
    public SpecialStack() {
        // Define Stack
        stack = new Stack<>();
        min = new Stack<>();
    }

    public void push(int x) {
        // Add an element to the top of Stack
        if(min.isEmpty()){
            min.push(x);
        }else  if(x<=min.peek()) min.push(x);
        stack.push(x);
    }

    public void pop() {
        // Remove the top element from the Stack
        if(stack.isEmpty()) return;
        int poped = stack.pop();
        if(poped == min.peek()) min.pop();
        
    }

    public int peek() {
        // Returns top element of the Stack
        if(stack.isEmpty()) return -1;
        return stack.peek();
    }

    boolean isEmpty() {
        // Check if the stack is empty
        if(stack.isEmpty()) return true;
        return false;
    }

    public int getMin() {
        // Finds minimum element of Stack
        if(min.isEmpty()) return -1;
        return min.peek();
    }
}