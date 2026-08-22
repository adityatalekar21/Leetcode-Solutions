class Solution {
    public boolean checkDivisibility(int n) {
        int num = n;
        int sum = 0;
        int product = 1;
        while(n != 0){
            int d = n % 10;
            sum += d;
            product *= d;
            n /= 10;
        }
        return num % (sum + product) == 0 ? true : false;
    }
}