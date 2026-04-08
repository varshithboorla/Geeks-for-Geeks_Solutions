class Solution {
    
    
    void rec(Queue<Integer> q, int k){
        if(k==0) return;
        int f = q.poll();
        rec(q,k-1); 
        q.add(f);
        
    }
    public Queue<Integer> reverseFirstK(Queue<Integer> q, int k) {
        // code here
        if(k>q.size()||k<=0) return q;
        rec(q,k);
        for(int i=0;i<q.size()-k;i++){
            q.add(q.poll());
        }
        return q;
    }
}