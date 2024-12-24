class Solution {
    public static int smallestDivisor(int[] nums, int threshold) {
        long max = Integer.MIN_VALUE;
        for(int num : nums){
            max = Math.max(max, num);
        }

        long start = 1;
        long end = max;
        while(start <= end){
            long mid = start+(end-start)/2;
            int total = sum(nums,mid);
            if(total <= threshold) end = mid-1;
            else start = mid+1;
        }
        return (int)start;
    }
    public static int sum(int[] nums, long divisor){
        double total  = 0;
        for(int num : nums){
            total = total + Math.ceil((double)num/divisor);
        }
        return (int)total;
    }
}