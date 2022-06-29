class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        
        int count1=0, max=0;
        
        for(int i=0; i<nums.length; i++){
            if(nums[i] == 1){
                count1 += 1;
            }else if(nums[i] == 0){
                count1 = 0;
            }
            if(count1 > max) max = count1;
        }
        
        return max;
    }
}
