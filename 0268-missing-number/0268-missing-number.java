class Solution {
    public int missingNumber(int[] arr) {

        int i = 0;
        int n = arr.length;
        while (i < arr.length) {
            int correct = arr[i];

            if (arr[i] < n && arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else {
                i++;
            }

        }
        for (int j = 0; j < arr.length; j++) {
            int num = j;
            if (arr[j] != num) {
                return num;
            }
        }
        return n;

    }

    public static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
