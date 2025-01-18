class Solution {
    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        if(candidates == null || candidates.length == 0) return result;
        List<Integer> ans = new ArrayList<>();
        helper(0,candidates,target,ans,result);
        return result;
    }
    private static void helper(int index,int[] candidates, int target,List<Integer> ans, List<List<Integer>> result){
        int s = sum(ans);
        if(s == target){
            result.add(new ArrayList<>(ans));
            return;
        }
        if(index == candidates.length || s > target) return;

        ans.add(candidates[index]);
        helper(index, candidates, target, ans, result);

        ans.remove(ans.size()-1);
        helper(index+1, candidates, target, ans, result);

        return;
    }
    private static int sum(List<Integer> ans){
        int s = 0;
        for(Integer n : ans) s = s + n;
        return s;
    }
}