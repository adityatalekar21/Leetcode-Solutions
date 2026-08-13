class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        HashMap<Integer, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        for(int num : arr1){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        for(int num : arr2){
            int c = map.get(num);
            while(c-- > 0){
                list.add(num);
            }
            map.remove(num);
        }
        List<Integer> rem = new ArrayList<>(map.keySet());
        Collections.sort(rem);
        for(int num : rem){
            int c = map.get(num);
            while(c-- > 0){
                list.add(num);
            }
        }
        
        int arr[] = new int[list.size()];
        for(int i = 0; i < list.size(); i++){
            arr[i] = list.get(i);
        }
        return arr;
    }
}