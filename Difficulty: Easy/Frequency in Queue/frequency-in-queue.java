class Geeks {
    static void enqueue(Queue<Integer> q, int k) {
        //  code here
        q.add(k);
    }

    static int findFrequency(Queue<Integer> q, int k) {
        
        int count = 0;
        for(int i=0;i<q.size();i++){
            int el = q.poll();
            if(el==k) count++;
            q.add(el);
        }
        return count;
        //  code here
    }
}