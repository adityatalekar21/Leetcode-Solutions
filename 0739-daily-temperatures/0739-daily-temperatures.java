class Solution {
    public int[] dailyTemperatures(int[] temp) {

        Stack<Integer> stack = new Stack<>();
        int[] answer = new int[temp.length];

        for (int i = 0; i < temp.length; i++) {
            while (!stack.isEmpty() &&
                    temp[i] > temp[stack.peek()]) {

                int previousIndex = stack.pop();
                answer[previousIndex] = i - previousIndex;
            }

            stack.push(i);
        }

       
        return answer;

    }
}