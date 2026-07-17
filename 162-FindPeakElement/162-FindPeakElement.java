// Last updated: 7/17/2026, 3:15:57 PM
class Solution {
    public int findPeakElement(int[] nums) {
        int max=0;
        for(int i=0;i<nums.length;i++) 
        {
            if(nums[i]>nums[max]) {
                max=i;
            }
        }
        return max;
    }
}
