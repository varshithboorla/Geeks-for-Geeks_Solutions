class Solution {
    public ArrayList<Integer> missingRange(int[] arr, int low, int high) {
        // code here
        boolean[] a = new boolean[100000+1];
        for(int i=0;i<arr.length;i++){
            a[arr[i]] = true;
        }
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=low;i<=high;i++){if(a[i]==false) list.add(i);}
        return list;
    }
}