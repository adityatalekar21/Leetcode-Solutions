class Solution {
    public int missingMultiple(int[] nums, int k) {
        HashSet<Integer> set = new HashSet<>();

        for (int i : nums) {
            set.add(i);
        }

        int num = k;
        while (true) {
            if (set.contains(num)) {
                num += k;
            } else {
                return num;
            }

        }

    }
}