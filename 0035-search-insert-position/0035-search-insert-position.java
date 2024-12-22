class Solution {
    public int searchInsert(int[] nums, int target) {
        int[] res = binary(nums,target);
        if(res[0] != -1) return res[0];
        return res[1]+1;
    }
    public int[] binary(int[] arr, int k){
        int s=0;
        int e=arr.length-1;
        while(s<=e){
            int mid = s+(e-s)/2;
            if(arr[mid] == k){
                return new int[]{mid,mid};
            }
            else if(k > arr[mid]) s= mid+1;
            else e= mid-1;
        }
        return new int[]{-1,e};
    }
}