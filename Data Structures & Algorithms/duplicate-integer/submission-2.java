class Solution {
    public boolean hasDuplicate(int[] nums) {
        Hashtable<Integer,Integer> mt = new Hashtable<>();
        for(int i=0 ; i<nums.length ; i++){
            if(mt.containsKey(nums[i])==false){
                mt.put(nums[i],1);
            }else{
                return true;
            }
        }
        return false;
    }
}