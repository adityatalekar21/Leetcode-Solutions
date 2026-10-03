class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int arr[] = new int [n];
        arr[0] = 1;

        for(int i = 1; i < n; i++){
            arr[i] = nums[i -1] * arr[i - 1];
        }

        int arr1[] = new int[n];
        arr1[nums.length - 1] = 1;

        for(int i = nums.length - 2; i >=0 ; i--){
            arr1[i] = nums[i + 1] * arr1[i + 1];
        }
        
        int ans[] = new int[n];
        for(int i = 0; i < n; i++){
            ans[i] = arr[i] * arr1[i];
        }
        return ans;

          

        
    }
}