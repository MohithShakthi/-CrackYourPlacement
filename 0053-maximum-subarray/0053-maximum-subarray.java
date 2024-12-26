class Solution {
    public int maxSubArray(int[] nums) {
        int max=Integer.MIN_VALUE;
        int rad=0;
        for(int i=0;i<nums.length;i++){
            rad=rad+nums[i];
            if(rad>max){
                max=rad;
            }
            if(rad<0){
                rad=0;
            }
        }
        return max;
    }
}