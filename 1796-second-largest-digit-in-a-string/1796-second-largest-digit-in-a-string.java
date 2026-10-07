class Solution {
    public int secondHighest(String s) {
        
        int max1 = -1 ;
        int max2 = -1;
        for(int i = 0; i < s.length(); i++){
            char k= s.charAt(i);
            if(Character.isDigit(k)){
                int num = k -'0';
               if(num > max1){ 
                max2 = max1;
                max1 = num;
               
            }else if(num < max1 && num > max2){
                max2 = num;
            }
        }
    }
        return max2;
    }
}