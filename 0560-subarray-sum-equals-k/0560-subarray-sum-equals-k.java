class Solution {
    public int subarraySum(int[] nums, int k) {
        int count = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] == k) count++;
            int j = i+1;
            int sum = nums[i];
            while(j < nums.length){
                sum += nums[j];
                if(sum == k) count++;
                else if(sum > k) break;
                j++;
            }
        }
        return count;
    }
}