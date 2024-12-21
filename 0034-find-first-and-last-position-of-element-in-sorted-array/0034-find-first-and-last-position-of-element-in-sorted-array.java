class Solution {
    public int[] searchRange(int[] nums, int target) {
     int[] res = {-1,-1};
     res[0] = binarySearch(nums, target, true);
     res[1] = binarySearch(nums, target, false);
     return res;
    }
    public int binarySearch(int[] arr, int k, boolean findFirst){
        int ans = -1;
        int s= 0;
        int e = arr.length-1;
        while(s<e){
            int mid = s + (e-s)/2;
            if(k > arr[mid]) s = mid+1;
            else if(k < arr[mid]) e = mid-1;
            else{
                ans = mid;
                if(findFirst) e = mid-1;
                else s = mid+1;
            }
        }
        return ans;
    }
}