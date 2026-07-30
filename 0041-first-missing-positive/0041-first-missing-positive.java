class Solution {
    public int firstMissingPositive(int[] arr) {

        int i = 0;

        while (i < arr.length) {
            int correct = arr[i] - 1;

            if (arr[i] > 0 && arr[i] <=arr.length && arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else {
                i++;
            }

        }
        for (int satara = 0; satara < arr.length; satara++) {
            if (arr[satara] != satara + 1) {
                return satara + 1;
            }
        }
        return arr.length + 1;

    }

    public static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
