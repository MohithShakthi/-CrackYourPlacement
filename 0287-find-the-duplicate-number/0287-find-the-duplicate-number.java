class Solution {
    public int findDuplicate(int[] nums) {
        cycleSort(nums);
        int count = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] != i+1) return nums[i];
        }
        return count;
    }
    public void cycleSort(int[] nums){
        int i=0;
        while(i<nums.length){
            int correctIndex = nums[i]-1;
            if(nums[i] != nums[correctIndex]){
                swap(i,correctIndex,nums);
            }else{
                i++;
            }
        }
    }
    public void swap(int a, int b, int[] nums){
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp; 
    }
}