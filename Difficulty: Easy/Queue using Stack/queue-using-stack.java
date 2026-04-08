class myQueue {
    Stack<Integer> s = new Stack<>();
    Stack<Integer> o = new Stack<>();

    // Initialize your data members

    void enqueue(int x) {
        // Implement enqueue operation
        if(o.size()==0)
            s.push(x);
        else{
            while(o.size()!=0){
                s.push(o.pop());
            }
            s.push(x);
        }
    }

    void dequeue() {
        // Implement dequeue operation
        if(s.size()==0&&o.size()==0) return;
        if(o.size()==0){
            while(s.size()!=0){
                o.push(s.pop());
            }
        }
        o.pop();
        
    }

    int front() {
        // Implement front operation
        if(s.size()==0&&o.size()==0) return -1;
        if(o.size()==0){
            while(s.size()!=0){
                o.push(s.pop());
            }
        }
        return o.peek();
    }

    int size() {
        // Implement size operation
        return s.size()+o.size();
    }
}
