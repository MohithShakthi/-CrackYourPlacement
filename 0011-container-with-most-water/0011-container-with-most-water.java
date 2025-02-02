class Solution {
    public int maxArea(int[] height) {
        int area = Integer.MIN_VALUE;
        int i = 0;
        int j = height.length-1;
        while(i < j){
            int b = j-i;
            int h = Math.min(height[i], height[j]);
            area = Math.max(b*h,area);
            if(height[i] < height[j]){
                i++;
            }else{
                j--;
            }
        }
        return area;
    }
}