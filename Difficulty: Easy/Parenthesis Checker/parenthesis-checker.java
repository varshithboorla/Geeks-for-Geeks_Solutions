class Solution {
    public boolean isBalanced(String s) {
        // code here
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='['||s.charAt(i)=='{'||s.charAt(i)=='('){
                stack.add(s.charAt(i));
            }else{
                if(!stack.isEmpty()){
                    if((s.charAt(i)==']'&&stack.peek()!='[')||(s.charAt(i)=='}'&&stack.peek()!='{')||(s.charAt(i)==')'&&stack.peek()!='(')){
                        return false;
                    }else{
                        stack.pop();
                    }
                }else{
                    return false;
                }
            }
        }
        if(!stack.isEmpty()) return false;
        return true;
    }
}
