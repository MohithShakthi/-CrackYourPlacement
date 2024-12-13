class Solution {
    public int[] twoSum(int[] nums, int target) {
        int i = 0;
        int[] result = new int[2];
        while(i<nums.length){
            for(int j=i+1; j<nums.length;j++){
                if(nums[i]+nums[j] == target){
                    result[0] = i;
                    result[1] = j;
                }
            }
            i++;
        }
        return result;
    }
}