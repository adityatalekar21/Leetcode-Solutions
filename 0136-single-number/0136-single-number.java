class Solution {
    public int singleNumber(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int num : nums){
            if(set.contains(num)) set.remove(num);
            else set.add(num);
        }
        int element = set.iterator().next();
        return element;
    }
}