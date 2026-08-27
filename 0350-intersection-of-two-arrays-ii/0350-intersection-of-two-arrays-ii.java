class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums1.length; i++) {
            int num = nums1[i];

            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums2.length; i++) {
            if (map.containsKey(nums2[i]) && map.get(nums2[i]) > 0){
                list.add(nums2[i]);
                map.put(nums2[i], map.get(nums2[i]) - 1);
            }
        }
        int[] array = new int[list.size()];

        int i = 0;
        for (int j : list) {
            array[i] = j;
            i++;
        }

        return array;

    }
}