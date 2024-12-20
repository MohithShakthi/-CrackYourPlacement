class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] prefix = new int[nums.length];
        int[] suffix = new int[nums.length];
        prefix[0] = 1;
        suffix[nums.length-1] = 1;
        int sum = 1;
        for(int i=1;i<nums.length;i++){
            sum = sum*nums[i-1];
            prefix[i] = sum;
        }
        sum =1;
        for(int i=nums.length-2;i>=0;i--){
            sum = sum*nums[i+1];
            suffix[i] = sum;
        }
        for(int i=0;i<nums.length;i++) nums[i] = prefix[i]*suffix[i];
        return nums;
    }
}