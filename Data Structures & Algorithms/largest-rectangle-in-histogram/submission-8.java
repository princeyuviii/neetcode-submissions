class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> stk = new Stack<>();
        int n = heights.length;
        int mx = 0;

        for(int i=0 ; i<=n ; i++){

            while(!stk.isEmpty() && (i==n || heights[stk.peek()] > heights[i])){
                int width;
                int height = heights[stk.pop()];
                if(stk.isEmpty()){
                    width = i;
                }else{
                    width = i - stk.peek() -1;
                }

                mx = Math.max(mx, width*height);
            }
            stk.push(i);
        }
        return mx;
    }
}
