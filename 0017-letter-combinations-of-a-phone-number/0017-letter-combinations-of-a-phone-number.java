class Solution {
    public static List<String> letterCombinations(String digits){
        List<String> res = new ArrayList<>();
        if(digits == null || digits.isEmpty()) return res;
        Map<Character, String> map = new HashMap<>();
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");
        helper("",digits,res,map);
        return res;
    }
    public static void helper(String p, String up, List<String> res, Map<Character, String> map){
        if(up.isEmpty()){
            res.add(p);
            return;
        }
        Character num = up.charAt(0);
        if(map.containsKey(num)){
            for(int i = 0; i < map.get(num).length(); i++){
                helper(p + map.get(num).charAt(i), up.substring(1), res, map);
            }
        }else{
            helper(p, up.substring(1), res, map);
        }
        return;
    }
}