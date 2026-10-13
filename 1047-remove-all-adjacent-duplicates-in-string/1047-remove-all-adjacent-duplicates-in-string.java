class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> stack = new Stack<>();
      for(char c : s.toCharArray()){
      
        if(!stack.isEmpty() && stack.peek() == c){
            stack.pop();
        }else{
            stack.push(c);
        }
      }
      StringBuilder buil = new StringBuilder();
       
       for(char c : stack){
          buil.append(c);
       }


      return buil.toString();
    }
}