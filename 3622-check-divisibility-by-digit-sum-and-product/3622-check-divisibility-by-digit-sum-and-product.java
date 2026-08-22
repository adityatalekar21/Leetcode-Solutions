class Solution {
    public boolean checkDivisibility(int n) {
        int sum = 0;
        int mul = 1;
        int original = n;
        while (n > 0) {
            int product = n % 10;
            sum += product;
            mul *= product;

            n /= 10;
        }
        int fin = sum + mul;
        return original % fin == 0;
    }
}