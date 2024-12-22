//{ Driver Code Starts
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            int x = Integer.parseInt(br.readLine());
            String[] input = br.readLine().split(" ");
            int[] arr = new int[input.length];
            for (int i = 0; i < input.length; i++) {
                arr[i] = Integer.parseInt(input[i]);
            }

            Solution ob = new Solution();
            int[] ans = ob.getFloorAndCeil(x, arr);
            System.out.println(ans[0] + " " + ans[1]);
        
System.out.println("~");
}
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    public int[] getFloorAndCeil(int x, int[] arr) {
        int[] res = {-1,-1};
        Arrays.sort(arr);
        int f = binary(arr,x,true);
        if(f != -1) res[0] = arr[f];
        int c = binary(arr,x,false);
        if(c != -1) res[1] = arr[c];
        return res;
    }
    public int binary(int[] arr, int k, boolean isFloor){
        int ans = -1;
        int s =0;
        int e = arr.length-1;
        while(s<=e){
            int mid = s+(e-s)/2;
            if(arr[mid] == k) return mid;
            else if(k >arr[mid]) s = mid+1;
            else e = mid-1;
        }
        if(isFloor && e>=0) ans = e;
        else if(!(isFloor) && s<arr.length) ans = s;
        return ans;
    }
}
