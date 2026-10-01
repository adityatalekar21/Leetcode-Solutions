class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for(char c : s.toCharArray()){
           if(c == '(' || c =='{' || c =='['){
                stack.push(c);
           }else{
                if(stack.isEmpty()) return false;

                char gh = stack.pop();

                if(c == ')' && gh != '(') return false;
                if(c == '}' && gh != '{') return false;
                if(c == ']' && gh != '[') return false;
            }
        }
    
        return stack.isEmpty();
        
    }
}