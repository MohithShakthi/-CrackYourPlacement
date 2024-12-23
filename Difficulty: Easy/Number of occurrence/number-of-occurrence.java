//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());

        while (tc-- > 0) {

            String[] str = br.readLine().trim().split(" ");
            int[] a = new int[str.length];
            for (int i = 0; i < str.length; i++) {
                a[i] = Integer.parseInt(str[i]);
            }
            String[] nk = br.readLine().trim().split(" ");
            int k = Integer.parseInt(nk[0]);
            Solution sln = new Solution();
            int ans = sln.countFreq(a, k);

            System.out.println(ans);
            System.out.println("~");
        }
    }
}
// } Driver Code Ends


class Solution {
    int countFreq(int[] arr, int target) {
        int f = binary(arr,target,true);
        int l = binary(arr,target,false);
        if(f == -1 && l == -1) return 0;
        return l-f+1;
    }
    public int binary(int[] nums, int k, boolean isFirst){
        int s=0;
        int e=nums.length-1;
        int ans = -1;
        while(s<=e){
            int mid = s+(e-s)/2;        
            if(nums[mid] == k){
                ans = mid;
                if(isFirst) e = mid-1;
                else s = mid+1;
            }
            else if(k > nums[mid]) s = mid+1;
            else e = mid-1;
        }
        return ans;
    }
}
