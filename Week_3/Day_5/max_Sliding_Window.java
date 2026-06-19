class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {

        PriorityQueue<int[]> que = new PriorityQueue<>((a, b) -> b[0] - a[0]);

        int[] max = new int[nums.length - k + 1];
        int index = 0;

        for (int i = 0; i < nums.length; i++) {

            que.offer(new int[]{nums[i], i});

            while (que.peek()[1] <= i - k) {
                que.poll();
            }

            if (i >= k - 1) {
                max[index++] = que.peek()[0];
            }
        }

        return max;
    }
}