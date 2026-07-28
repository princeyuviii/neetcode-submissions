class Solution {
    public int maxArea(int[] heights) {
        int l =0;
        int r = heights.length-1;
        int mx =0 ;

        while(l<r){
            int area = Math.min(heights[l], heights[r]) * (r-l);
            if(heights[l]<heights[r]){
                l++;
            }else{
                r--;
            }

            mx = Math.max(mx,area);

        }



        return mx;
        
    }
}
