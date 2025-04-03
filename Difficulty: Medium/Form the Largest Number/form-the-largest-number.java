//{ Driver Code Starts
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine(); // Consume newline
        while (t-- > 0) {
            String input = sc.nextLine();
            String[] numbers = input.split(" ");
            int[] arr = new int[numbers.length];
            for (int i = 0; i < numbers.length; i++) {
                arr[i] = Integer.parseInt(numbers[i]);
            }

            Solution ob = new Solution();
            String ans = ob.findLargest(arr);
            System.out.println(ans);
            System.out.println("~");
        }
        sc.close();
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    public static String findLargest(int[] arr) {
        String[] strs = new String[arr.length];
        for(int i=0;i<arr.length;i++){
            strs[i] = String.valueOf(arr[i]);
        }
        Arrays.sort(strs,((a,b) -> (b+a).compareTo(a+b)));
        StringBuilder builder = new StringBuilder();
        if(strs[0].equals("0")) return "0";
        for(String str : strs){
            builder.append(str);
        }
        return builder.toString();
        
    }
}