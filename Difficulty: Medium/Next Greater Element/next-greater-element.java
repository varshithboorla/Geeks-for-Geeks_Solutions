class Solution {
    public ArrayList<Integer> nextLargerElement(int[] arr) {
        // code here
        Stack<Integer> st = new Stack<>();
        ArrayList<Integer> list = new ArrayList<>();
        st.push(-1);
        if(arr.length<=1){
            list.add(-1);
            return list;
        }
        for(int i=arr.length-1;i>=0;i--){
            while(!st.isEmpty()){
                int j = st.pop();
                if(arr[i]<j){
                    st.push(j);
                    list.add(j);
                    break;
                }
            }
            if(st.isEmpty()) list.add(-1);
            st.push(arr[i]);
        }
        Collections.reverse(list);
        return list;
    }
}