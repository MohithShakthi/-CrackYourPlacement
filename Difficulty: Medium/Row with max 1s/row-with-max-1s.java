//{ Driver Code Starts
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // Number of test cases
        sc.nextLine();        // Consume the newline character

        while (t-- > 0) {
            String input = sc.nextLine();

            // Replace ][ with ],[
            input = input.replace("][", "],[");

            ArrayList<ArrayList<Integer>> mat = new ArrayList<>();
            String[] rows = input.split("],\\s*\\[");

            for (String row : rows) {
                row = row.replaceAll("[\\[\\]]", ""); // Remove any surrounding brackets
                ArrayList<Integer> intRow = new ArrayList<>();
                for (String num : row.split(",")) {
                    intRow.add(Integer.parseInt(num.trim()));
                }
                mat.add(intRow);
            }

            Solution obj = new Solution();
            int result = obj.rowWithMax1s(convertListToArray(mat));

            System.out.println(result);

            System.out.println("~");
        }
        sc.close();
    }

    // Helper method to convert ArrayList<ArrayList<Integer>> to 2D array
    public static int[][] convertListToArray(ArrayList<ArrayList<Integer>> mat) {
        int rows = mat.size();
        int cols = mat.get(0).size();
        int[][] arr = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = mat.get(i).get(j);
            }
        }
        return arr;
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    public int rowWithMax1s(int arr[][]) {
        // code here
        int ans = -1;
        int count = 0;
        for(int i=0;i<arr.length;i++){
            int firstIndex = lowerBoundBs(arr[i]);
            if(firstIndex != -1){
                int oneCount = arr[i].length - firstIndex;
                if(oneCount > count){
                    count = oneCount;
                    ans = i;
                }
            }
        }
        return ans;
    }
    public static int lowerBoundBs(int[] nums){
        int ans = -1;
        int s = 0;
        int e = nums.length-1;
        while(s<=e){
            int mid = s + (e - s)/2;
            if(nums[mid] == 1){
                ans = mid;
                e = mid-1;
            }
            else if(nums[mid] < 1) s = mid+1;
            else e = mid-1;
        }
        return ans;
    }
}