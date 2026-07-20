class Solution {
    public int arrayPairSum(int[] nums) {
        int max = 0;
        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i += 2) {
            int min = 0;
            min = Math.min(nums[i], nums[i + 1]);
            max += min;

        }
        return max;

    }
}