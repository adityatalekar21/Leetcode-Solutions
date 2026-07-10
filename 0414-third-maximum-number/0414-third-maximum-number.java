class Solution {
    public int thirdMax(int[] nums) {

        Long first = null;
        Long second = null;
        Long third = null;

        for (int num : nums) {

            // Skip duplicates
            if ((first != null && num == first) ||
                (second != null && num == second) ||
                (third != null && num == third)) {
                continue;
            }

            // Update first, second, third
            if (first == null || num > first) {
                third = second;
                second = first;
                first = (long) num;
            }
            // Update second and third
            else if (second == null || num > second) {
                third = second;
                second = (long) num;
            }
            // Update third
            else if (third == null || num > third) {
                third = (long) num;
            }
        }

        // If third maximum doesn't exist, return the maximum
        return third == null ? first.intValue() : third.intValue();
    }
}