class Solution {
    public String reverseWords(String original) {
        char[] characters = original.toCharArray();
        int left = 0;
        for (int i = 0; i <= characters.length; i++) {
            if (i == characters.length || characters[i] == ' ') {
                swap(characters, left, i - 1);
                left = i + 1;

            }
        }
        return new String(characters);

    }

    static void swap(char arr[], int left, int right) {
        while (left < right) {
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
    }

}