class Solution {
    public static int longestOnes(int[] nums, int k) {
        int i=0,z=0,max = 0;
        for(int j=0; j<nums.length; j++){
            if(nums[j] == 0){
                z++;
            }
            if(z > k){
                if(nums[i] == 0){
                    z--;
                }
                i++;
            }
            max = Math.max(max, j-i+1);
        }
        return max;
    }
}