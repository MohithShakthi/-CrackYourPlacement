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
            int ans = sln.aggressiveCows(a, k);

            System.out.println(ans);
            System.out.println("~");
        }
    }
}
// } Driver Code Ends


// User function Template for Java
class Solution {
    public static int aggressiveCows(int[] stalls, int k){
        Arrays.sort(stalls);
        int start = 1;
        int end = stalls[stalls.length-1];
        while(start <= end){
            int mid = start+(end-start)/2;
            int cowCount = findCowCount(stalls,mid);
            if(cowCount >= k) start = mid+1;
            else end = mid-1;
        }
        return end;
    }
    public static int findCowCount(int[] nums, int dist){
        int cowCount =1;
        int last = nums[0];
        for(int n : nums){
            if(n-last >= dist){
                cowCount++;
                last = n;
            }
        }
        return cowCount;
    }
}