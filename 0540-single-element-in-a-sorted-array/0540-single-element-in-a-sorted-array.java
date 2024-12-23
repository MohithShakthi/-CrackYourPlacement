class Solution {
    public int singleNonDuplicate(int[] nums) {
        if(nums.length == 1) return nums[0];
        return nums[binary(nums)];
    }
    public int binary(int[] nums){
        int s=0;
        int e=nums.length-1;
        while(s<=e){
            int mid = s+(e-s)/2;
            if(mid > 0 && mid < nums.length-2 && nums[mid] > nums[mid-1] && nums[mid] < nums[mid+1]) return mid;
            else if(s == 0 && nums[s] < nums[s+1]) return s;
            else if(s > 0 && nums[s] > nums[s-1] && nums[s] < nums[s+1]) return s;
            else if(e == nums.length-1 && nums[e-1] < nums[e]) return e;
            else if(e < nums.length-1 && nums[e] > nums[e-1] && nums[e] < nums[e+1]) return e;
            else{
                s++;
                e--;
            } 
        }
        return 0;
    }
}