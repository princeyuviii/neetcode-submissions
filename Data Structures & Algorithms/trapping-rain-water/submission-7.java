class Solution {
    public int trap(int[] height) {
        int l = 0;
        int r = height.length-1;
        int lx = height[l];
        int rx = height[r];
        int mw = 0;

        while(l<r){
            if(lx<rx){
                l++;
                lx = Math.max(lx, height[l]);
                mw += lx - height[l];

            }else{
                r--;
                rx = Math.max(rx,height[r]);
                mw += rx - height[r];
            }
        }
        return mw;
    }
}
