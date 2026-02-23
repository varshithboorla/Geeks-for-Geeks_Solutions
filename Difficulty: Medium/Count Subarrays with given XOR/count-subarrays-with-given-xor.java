class Solution {
    public long subarrayXor(int arr[], int k) {
        // code here
        int xor = 0;
        long count=0;
        Map<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        for(int i=0;i<arr.length;i++){
            xor^=arr[i];
            
            if(map.containsKey(xor^k)) count+=map.get(xor^k);
            
            map.put(xor,map.getOrDefault(xor,0)+1);
        }
        return count;
    }
}