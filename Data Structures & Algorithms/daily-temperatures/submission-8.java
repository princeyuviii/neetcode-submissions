class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;

        int[] ans = new int[n];

        Stack<Integer> stk = new Stack<>();

        for(int i=0 ; i<n ; i++){
            
            while(!stk.isEmpty() && temperatures[i] > temperatures[stk.peek()]){
                int pd = stk.pop();
                ans[pd] = i - pd ;
            }
            stk.push(i);
        }
        return ans;
        
    }
}
