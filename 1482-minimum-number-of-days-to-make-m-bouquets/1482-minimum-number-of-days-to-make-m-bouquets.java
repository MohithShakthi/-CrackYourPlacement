class Solution {
    public static int minDays(int[] bloomDay, int m, int k) {
        if((long)bloomDay.length < (long)m*k) return -1;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int num : bloomDay){
            max = Math.max(max, num);
            min = Math.min(min, num);
        }

        int l = min;
        int r = max;
    
        while(l <= r){
            int mid = l+(r-l)/2;
            int noBoquets = check(bloomDay, mid, k);
            if(noBoquets >= m) r = mid-1;
            else l = mid+1;
        }

        return l;
    }
    public static int check(int[] nums, int mid, int k){
        int count = 0;
        int noBoquets = 0;
        for(int num : nums){
            if(num <= mid){
                count++;
                if(count == k){
                    noBoquets++;
                    count = 0;
                }
            }else{
                count = 0;
            }
        }
        return noBoquets;
    }
}