class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();

        for (int i : s.toCharArray()) {
            if (i != '#') {
                stack1.push(i);

            }else if (!stack1.isEmpty()){
                stack1.pop();
            }
        }

        for (int i : t.toCharArray()) {
            if (i != '#') {
                stack2.push(i);

            } else if(!stack2.isEmpty()){
                stack2.pop();
            }
        }

        if (stack1.size() != stack2.size()) {
            return false;
        }

        for (int i = 0; i < stack1.size(); i++) {
            if (stack1.get(i) != stack2.get(i)) {
                return false;
            }
        }

        return true;
    }
}