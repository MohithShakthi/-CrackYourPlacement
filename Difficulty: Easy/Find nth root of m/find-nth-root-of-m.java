//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.lang.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while (T-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            int m = Integer.parseInt(br.readLine().trim());
            Solution ob = new Solution();
            int ans = ob.nthRoot(n, m);
            System.out.println(ans);

            System.out.println("~");
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    public int nthRoot(int n, int m) {
        // code here
        int s = 1;
        int e = m;
        while(s<=e){
            int mid = s+(e-s)/2;
            if(pow(mid,n) == m) return mid;
            else if(pow(mid,n) > m) e = mid-1;
            else s = mid+1;
        }
        return -1;
    }
    public int pow(int n, int p){
        if(n == 0) return 0;
        if(p == 0) return 1;
        if(p == 1) return n;
        return n*pow(n, p-1);
    }
}