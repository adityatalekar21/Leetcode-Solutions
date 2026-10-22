class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {

        Stack<Integer> stack = new Stack<>();
        HashMap<Integer,Integer> map = new HashMap<>();


        for(int num : nums2){
            while(!stack.isEmpty() && num > stack.peek() ){
                map.put(stack.pop(),num);
            }
            stack.push(num);
        }
         
        int[] arr = new int[nums1.length];
        for(int i = 0; i < nums1.length; i++){
            if(map.containsKey(nums1[i])){
                arr[i] = map.get(nums1[i]);

            }else{
                arr[i] = -1;
            }
        }
        return arr;

      
        
    }
}

// Input: nums1 = [4,1,2], nums2 = [1,3,4,2]
// Output: [-1,3,-1]