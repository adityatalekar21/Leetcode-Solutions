class Solution {
    public int countEven(int num) {
        int count = 0;

        for (int i = 1; i <= num; i++) {
            int sum = 0;
            int value = i;

            while (value > 0) {
                int digit = value % 10;
                sum += digit;
                value /= 10;
            }
            if (sum % 2 == 0) {
                count++;
            }
        }
        return count;

    }
}
