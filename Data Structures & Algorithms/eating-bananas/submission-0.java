class Solution {

    private boolean canItEat(int[] piles, int h, int speed){
        int hours = 0;
        for(int pile : piles){
            hours += (pile + speed - 1)/speed;
        }
        return hours <= h;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high = 0;

        for(int pile : piles){
            high = Math.max(high,pile);
        }

        int ans = high ; 

        while(low<=high){
            int mid = low + (high-low)/2;

            if(canItEat(piles, h, mid)){
                ans = mid ;
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }
        return ans;
    }
}
