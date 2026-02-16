class Solution {
    static boolean canAttend(int[][] arr) {
        // code here
        Arrays.sort(arr,Comparator.comparingInt(a -> a[1]));
        for(int i=1;i<arr.length;i++){
            if(arr[i][0]<arr[i-1][1])return false;
        }
        return true;
    }
}