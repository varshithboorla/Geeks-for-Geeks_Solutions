class Solution {
    public boolean areIsomorphic(String s1, String s2) {
        // code here
        Map<Character,Character> map = new HashMap<>();
        Map<Character,Character> map1 = new HashMap<>();
        for(int i=0;i<s1.length();i++){
            char c = s1.charAt(i);
            char t = s2.charAt(i);
            if((map.containsKey(c)&&map.get(c)!=t)||(map1.containsKey(t)&&map1.get(t)!=c)){
                return false;
            }
            map.put(c,t);
            map1.put(t,c);
        }
        return true;
    }
}