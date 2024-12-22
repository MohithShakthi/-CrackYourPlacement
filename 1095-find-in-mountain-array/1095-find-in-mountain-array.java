/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int peak = findPeak(mountainArr);
        int res = binaryOA(mountainArr,0,peak,target);
        if(res != -1) return res;
        res = binaryOA(mountainArr,peak+1,mountainArr.length()-1,target);
        return res;
    }
    public int findPeak(MountainArray arr){
        int s = 0;
        int e = arr.length()-1;
        while(s<e){
            int mid = s+(e-s)/2;
            if(arr.get(mid) > arr.get(mid+1)) e = mid;
            else s = mid+1;
        }
        return s;
    }
    public int binaryOA(MountainArray arr, int s, int e, int k){
        boolean isAsc = arr.get(s) < arr.get(e);
        while(s<=e){
            int mid = s+(e-s)/2;
            int val = arr.get(mid);
            if(val == k) return mid;
            if(isAsc){
                if(k > val) s = mid+1;
                else e = mid-1;
            }else{
                if(k > val) e = mid-1;
                else s = mid+1;
            }
        }
        return -1;
    }
}