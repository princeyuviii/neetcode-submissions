class Solution {
    public int evalRPN(String[] tokens) {
        java.util.Stack<Integer> stk = new Stack<>();
        for(String token : tokens){
            switch(token){
                case "+":
                    stk.push(stk.pop() + stk.pop());
                    break;
                
                case "-":
                    int a = stk.pop();
                    int b = stk.pop();
                    stk.push(b-a);
                    break;
                
                case "*":
                    stk.push(stk.pop()*stk.pop());
                    break;

                case "/":
                    int c = stk.pop();
                    int d = stk.pop();
                    stk.push(d/c);
                    break;

                default:
                    stk.push(Integer.parseInt(token));
                    break;
            } 

        }
        return stk.pop();
    }
}
