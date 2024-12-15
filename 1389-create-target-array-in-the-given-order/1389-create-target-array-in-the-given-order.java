class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        ArrayList<Integer> l=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            l.add(index[i],nums[i]);
        }
        int[] arr=new int[nums.length];
        int r=0;
        for(int a:l){
            arr[r++]=a;
        }
        return arr;
    }
}