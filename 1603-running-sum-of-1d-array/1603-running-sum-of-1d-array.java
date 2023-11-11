class Solution {
    public int[] runningSum(int[] nums) {
        int runningSum = 0;
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            runningSum += nums[i];
            result[i] = runningSum;
        }
        return result;
    }
}
