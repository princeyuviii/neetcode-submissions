class Solution {
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        
        int mx = 0;


        for(int i=0 ; i<n ; i++){
            int width = 1;
            int left = i-1;

            while(left>=0 && heights[left]>=heights[i]){
                width++;
                left--;
            }

            int right = i+1;
            while(right<n && heights[right]>=heights[i]){
                width++;
                right++;
            }

            mx = Math.max(mx, width * heights[i]);

        }
        return mx;
        
    }


}
