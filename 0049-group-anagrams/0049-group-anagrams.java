class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for(String str : strs){
            char[] arr = str.toCharArray();
            Arrays.sort(arr);
            String value = String.valueOf(arr);
            map.computeIfAbsent(value, K -> new ArrayList<String>()).add(str);
        }
        return new ArrayList<>(map.values());
    }
}