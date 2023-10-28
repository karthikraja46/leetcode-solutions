class Solution {
    public int maximumDifference(int[] nums) {
        if (nums == null || nums.length < 2) {
            return -1; // There should be at least two elements to find a difference.
        }

        int mini = nums[0];
        int ans = -1;

        for (int i = 1; i < nums.length; i++) {
            ans = Math.max(ans, nums[i] - mini);
            mini = Math.min(mini, nums[i]);
        }

        return ans > 0 ? ans : -1;
    }
}
