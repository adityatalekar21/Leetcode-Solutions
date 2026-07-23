class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        List<String> list = new ArrayList<>();
        int min = Integer.MAX_VALUE;
        HashMap<String, Integer> map = new HashMap<>();
        for(int i = 0; i < list1.length; i++){
            map.put(list1[i], i);
        }
        for(int i = 0; i < list2.length; i++){
            if(map.containsKey(list2[i])){
                int least = i + map.get(list2[i]);
                if(least < min){
                    list.clear();
                    list.add(list2[i]);
                    min = least;
                }
                else if(least == min){
                    list.add(list2[i]);
                }
            }
        }
        String ans[] = new String[list.size()];
        for(int i = 0; i < list.size(); i++){
            ans[i] = list.get(i);
        }
        return ans;
    }
}