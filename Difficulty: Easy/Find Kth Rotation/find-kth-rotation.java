//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    // Driver code
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            List<Integer> arr = new ArrayList<>();
            String input1 = sc.nextLine();
            Scanner ss1 = new Scanner(input1);
            while (ss1.hasNextInt()) {
                arr.add(ss1.nextInt());
            }
            Solution ob = new Solution();
            int res = ob.findKRotation(arr);
            System.out.println(res);
        
System.out.println("~");
}
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    public int findKRotation(List<Integer> arr) {
        int p = findPivote(arr);
        if(p == -1) return 0;
        return p+1;
    }
    public int findPivote(List<Integer> arr){
        int s=0;
        int e=arr.size()-1;
        while(s<=e){
            int mid = s+(e-s)/2;
            if(mid < e && arr.get(mid) > arr.get(mid+1)) return mid;
            else if(mid > s && arr.get(mid) < arr.get(mid-1)) return mid-1;
            else if(arr.get(s) > arr.get(mid)) e = mid+1;
            else s = mid+1;
        }
        return -1;
    }
}