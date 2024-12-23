class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max = Integer.MIN_VALUE;
        for(int i=0;i<piles.length;i++){
            max = Math.max(max,piles[i]);
        }
         
         int s = 1;
         int e = max;
         while(s<=e){
            int mid = s+(e-s)/2;
            long totalTime = findTotalTime(piles, mid);
            if(totalTime <= h) e = mid-1;
            else s = mid+1;
         }
         return s;
    }
    public long findTotalTime(int[] nums, int perH){
        long sum = 0;
        for(int n : nums){
            //sum += (n + perH - 1) / perH;
            sum = sum + (long)Math.ceil((double)n/(double)perH);
        }
        return sum;
    }
}