class Solution {
    public boolean isValid(String s) {
        java.util.Stack<Character> stk = new java.util.Stack<>();

        for(char ch : s.toCharArray()){
            if(ch=='(' || ch=='{' || ch=='['){
                stk.push(ch);
            }else{
                if(stk.isEmpty()){
                    return false;
                }

                char top = stk.pop();

                if(ch==')' && top != '('){
                    return false;
                }
                
                if(ch=='}' && top != '{'){
                    return false;
                }

                if(ch==']' && top != '['){
                    return false;
                }
            }
        }
        return stk.isEmpty();
    }
}
