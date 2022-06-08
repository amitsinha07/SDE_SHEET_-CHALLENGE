class Solution {
    
    // Kadane's Algorithm
    // Time complexity : O(n)
    // Space Complexity : O(1)
    public int maxSubArray(int[] nums) {
        
        int localMax = 0, globalMax = Integer.MIN_VALUE, n = nums.length;
        for(int i = 0; i < n; i++){
            
            localMax += nums[i];
            globalMax = Math.max(globalMax, localMax);
            if(localMax < 0) localMax = 0;
        }
        return globalMax;
    }
}
