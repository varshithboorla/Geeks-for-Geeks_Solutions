// User function Template for Java
class StackQueue {
    Stack<Integer> s = new Stack<>();
    Stack<Integer> o = new Stack<>();
    public void push(int B) {
        // code here
        if(o.size()==0)
            s.push(B);
        else{
            while(o.size()!=0){
                s.push(o.pop());
            }
            s.push(B);
        }
        
    }

    public int pop() {
        if(s.size()==0&&o.size()==0) return -1;
        if(o.size()==0){
            while(s.size()!=0){
                o.push(s.pop());
            }
        }
        return o.pop();
        
        // code here
    }
}