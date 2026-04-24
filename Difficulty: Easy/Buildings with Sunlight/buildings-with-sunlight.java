class Solution {
    public int visibleBuildings(int arr[]) {
        // code here
        int max = 0;
        int count = 0;
        for(int i=0;i<arr.length;i++){
            if(max<=arr[i]){
                count++;
                max = arr[i];
            }
        }
        return count;
    }
}