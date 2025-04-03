class Solution {
    public int lengthOfLongestSubstring(String s) {
        int i = 0;
        int j = 0;
        int max = 0;
        int len = 0;
        Set<Character> set = new HashSet<>();
        while(j<s.length()){
            if(set.contains(s.charAt(j))){
                set.remove(s.charAt(i));
                i++;
                len--;
            }else{
                set.add(s.charAt(j));
                j++;
                len++;
                max = (len > max) ? len : max; 
            }
        }
        return max;
    }
}