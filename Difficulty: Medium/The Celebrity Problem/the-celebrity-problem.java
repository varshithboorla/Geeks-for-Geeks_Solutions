class Solution {
    public int celebrity(int mat[][]) {
        // code here
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<mat.length;i++){
            st.push(i);
        }
        while(st.size()>1){
            int i = st.pop();
            int j = st.pop();
            if(mat[i][j]==1) st.push(j);
            else st.push(i);
        }
        int j = st.pop();
        for(int i=0;i<mat.length;i++){
            if(j!=i){
                if(mat[j][i]==1||mat[i][j]==0){
                    return -1;
                }
            }
        }
        return j;
    }
}