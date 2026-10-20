class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<>();

        for(int i = 0 ; i < operations.length; i++){
            String c = operations[i];
           
                if(c.equals("C")){
                    stack.pop();
                    }
                else if(c.equals("D")){
                      int d = stack.peek();
                      stack.push(d * 2);
                }

               else if(c.equals("+")){
               int last = stack.get(stack.size() - 1);
               int secondLast = stack.get(stack.size() - 2);
               stack.push(last + secondLast);                
            } else{
               stack.push(Integer.parseInt(c));

            }
        }
        

                    int sum = 0;
                    for(int i:stack){
                     sum += i;
                   }
       return sum;
    }
}