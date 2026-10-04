class Solution {
    public int minRotations(String s) {
        int current = 0;
        int total = 0;
        int diff = 0;
        for (int i = 0; i < s.length(); i++) {

            int next = s.charAt(i) - '0';

            diff = Math.abs(current - next);
            total += Math.min(diff, 10 - diff);
            current = next;

        }
        return total;

    }
}