class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        Arrays.sort(nums);
        int start = nums[0];
        int end = nums[nums.length - 1];
        HashSet<Integer> set = new HashSet<>();

        for (int i = start; i <= end; i++) {
            if (!set.contains(i)) {
                set.add(i);
            }
        }

        for (int num : nums) {
            set.remove(num);
        }

        List<Integer> list = new ArrayList<>(set);
        Collections.sort(list);

        return list;

    }
}