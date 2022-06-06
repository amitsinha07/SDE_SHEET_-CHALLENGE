class Solution {
    public void sortColors(int[] nums) {
        int n= nums.length;
        int s=0 , p=0;  // s=start   p=pointer
        int e=n-1;    //e=end
        int temp=0;
        while(p<=e){
            if(nums[p]==0){
                // swap(nums[s],nums[p]);
                temp=nums[s];
                nums[s]=nums[p];
                nums[p]=temp;
           
                s++;
                p++;
            }
            else if(nums[p]==1){
                p++;
            }
            else if(nums[p]==2){
                // swap(nums[p],nums[e]);
                temp=nums[p];
                nums[p]=nums[e];
                nums[e]=temp;
                e--;
            }
        }
    }
}