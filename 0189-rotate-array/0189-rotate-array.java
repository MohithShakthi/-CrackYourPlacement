class Solution {
    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        int n = nums.length-1;
        nums = reverse(nums,0,n);
        nums = reverse(nums,0,k-1);
        nums = reverse(nums,k,n);
     }
    public static int[] reverse(int[] nums,int s,int e){
        while(s<e){
            int temp = nums[s];
            nums[s] = nums[e];
            nums[e] = temp;
            s++;
            e--;
        }
        return nums;
    }
}