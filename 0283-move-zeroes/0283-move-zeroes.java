class Solution {
    public void moveZeroes(int[] nums) {
        int counter=0;
        int index=0;
        int[] array = new int[nums.length];
        for(int i=0; i<nums.length; i++){
            if(nums[i]==0){
                counter++;
            }
            else{
                array[index]=nums[i];
                index++;
            }
        }
        for(int i=0; i<counter; i++){
            array[index]=0;
        }
        for(int i=0;i<nums.length;i++){
            nums[i]=array[i];
        }
    }
}