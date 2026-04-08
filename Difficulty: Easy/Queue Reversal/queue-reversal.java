class Solution {
    void rev(Queue<Integer> q,int k){
            if(k==0) return;
            int f = q.poll();
            rev(q,k-1);
            q.add(f);
        }
    public void reverseQueue(Queue<Integer> q) {
        // code here
        rev(q,q.size());
        
        
    }
}