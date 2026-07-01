class MinStack {

    java.util.Stack<Integer> stk;
    java.util.Stack<Integer> minStk;

    public MinStack() {
        stk = new Stack<>();
        minStk = new Stack<>();
    }
    
    public void push(int val) {
        stk.push(val);
        if(minStk.isEmpty() || val<=minStk.peek()){
            minStk.push(val);
        }
    }
    
    public void pop() {
        if(stk.peek().equals(minStk.peek())){
            stk.pop();
            minStk.pop();
        }else{
            stk.pop();
        }
    }
    
    public int top() {
        return stk.peek();
    }
    
    public int getMin() {
        return minStk.peek();
    }
}
