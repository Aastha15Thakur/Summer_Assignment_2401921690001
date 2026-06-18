class Solution {
    public int largestRectangleArea(int[] heights) {

        Stack<Integer> stack = new Stack<>();
        int maxArea = 0;
        int n = heights.length;

        for (int i = 0; i < n; i++) {

            while (!stack.isEmpty() && heights[i] < heights[stack.peek()]) {

                int index = stack.pop();
                int height = heights[index];

                int width;

                if (stack.isEmpty()) {
                    width = i;
                } else {
                    width = i - stack.peek() - 1;
                }

                int area = height * width;
                maxArea = Math.max(maxArea, area);
            }

            stack.push(i);
        }

        while (!stack.isEmpty()) {

            int index = stack.pop();
            int height = heights[index];

            int width;

            if (stack.isEmpty()) {
                width = n;
            } else {
                width = n - stack.peek() - 1;
            }

            int area = height * width;
            maxArea = Math.max(maxArea, area);
        }

        return maxArea;
    }
}