class Solution {
    public String removeOuterParentheses(String str) {
        StringBuilder s = new StringBuilder();
        Stack<Character> sk = new Stack<>();
        for (char c : str.toCharArray()) {
            if (c == '(') {
                if (sk.size() != 0)
                    s.append(c);
                sk.push(c);
            } else {
                sk.pop();
                if (sk.size() != 0)
                    s.append(c);
            }
        }
        return s.toString();
    }
}