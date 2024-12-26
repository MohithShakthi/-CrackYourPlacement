class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int sum = 0;
        int currMax = 0;
        int currMin = 0;
        for(int n : nums){
            currMax = Math.max(currMax + n, n);
            currMin = Math.min(currMin + n, n);
            sum = sum + n;
            max = Math.max(max, currMax);
            min = Math.min(min, currMin);
        }
        if(max > 0){
            return Math.max(max, sum - min);
        }else{
            return max;
        }
    }
}