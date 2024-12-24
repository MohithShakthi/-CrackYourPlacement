class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for(int num : weights){
            max = Math.max(max,num);
            sum = sum + num;
        }

        int start = max;
        int end = sum;
        while(start <= end){
            int mid = start+(end-start)/2;
            int takenDays = findDays(weights,mid);
            if(takenDays <= days) end = mid-1;
            else start = mid+1;
        }
        return start;
    }
    public int findDays(int[] nums,int capacity){
        int sum = 0;
        int days = 0;
        for(int num : nums){
            if((sum+num) <= capacity){
                sum = sum + num;
            }else{
                days++;
                sum = num;
            }
        }
        days++;
        return days;
    }
}