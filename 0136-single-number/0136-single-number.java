class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer, Integer> set = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (set.containsKey(nums[i])){
                set.put(nums[i], set.get(nums[i]) + 1);
            } else {
                set.put(nums[i], 1);
            }
        }
        for (int num : nums) {
            if (set.get(num) == 1) {
                return num;
            }
        }

        return -1;

    }
}