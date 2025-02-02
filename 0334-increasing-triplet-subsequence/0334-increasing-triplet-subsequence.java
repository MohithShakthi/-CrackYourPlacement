class Solution {
    public boolean increasingTriplet(int[] nums) {
        if(nums.length < 3) return false;
        int first = nums[0];
        int second = nums[1];
        for(int i = 2; i < nums.length; i++){
            if(nums[i] <= first) first = nums[i];
            else if(nums[i] <= second) second = nums[i];
            else return true;
        }
        return false;
    }
}