class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap<Integer,Integer> mp = new HashMap<>();
        for(int i=0 ; i<nums.length ; i++){
            if(mp.containsKey(nums[i])==false){
                mp.put(nums[i],1);
            }else{
                return true;
            }
        }
        return false;
    }
}