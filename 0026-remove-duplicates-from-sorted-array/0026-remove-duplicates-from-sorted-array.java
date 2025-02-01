class Solution {
    public int removeDuplicates(int[] nums) {
        int len = nums.length;
        int l = 1;
        int r = 1;
        while(r<len){
            if(nums[r] != nums[r-1]){
                nums[l] = nums[r];
                l++;
                r++;
            }
            else{
                r++;
            }
        }
        return l;
    }
}