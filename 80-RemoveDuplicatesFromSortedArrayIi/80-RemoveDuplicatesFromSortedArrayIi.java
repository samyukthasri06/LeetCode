// Last updated: 7/17/2026, 3:16:47 PM
class Solution {
    public int removeDuplicates(int[] nums) {
        int index = 0;

        for (int num : nums) {
            if (index < 2 || num != nums[index - 2]) {
                nums[index] = num;
                index++;
            }
        }

        return index;
    }
}