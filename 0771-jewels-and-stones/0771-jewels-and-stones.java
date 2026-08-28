class Solution {
    public int numJewelsInStones(String jewels, String stones) {
         HashSet<Character> set = new HashSet<>();
         char[] jew = jewels.toCharArray();

         for( char c : jew){
            set.add(c);
            
         }
           int count = 0;
         for(int i = 0; i < stones.length(); i++ ){
            if(set.contains(stones.charAt(i))){
                count++;

            }
         }
         return count;

    }
}