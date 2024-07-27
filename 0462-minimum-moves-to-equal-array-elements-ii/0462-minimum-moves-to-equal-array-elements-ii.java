class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int mid = nums[nums.length / 2];
        int count = 0;
        for(int num : nums){
            count = count + Math.abs(mid-num);
        }
        return count;
    }
}