class Solution {
    public boolean isValid(String s) {
        Stack<Character> arr = new Stack<>();
        for(char c : s.toCharArray()){
            if(c == '(' || c == '{' || c == '[' ){
                arr.push(c);
            }
            else{
                if(arr.isEmpty()){
                    return false;
                }
                char top = arr.peek();
                if((top == '(' && c == ')') || (top == '{' && c == '}') || (top == '[' && c == ']')){
                    arr.pop();
                }else{
                    return false;
                }
            }
        }
        return arr.isEmpty();
    }
}