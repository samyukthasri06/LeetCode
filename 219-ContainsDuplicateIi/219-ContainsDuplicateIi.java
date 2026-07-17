// Last updated: 7/17/2026, 3:15:17 PM
class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            // If number already exists
            if (map.containsKey(nums[i])) {

                // Check index difference
                if (i - map.get(nums[i]) <= k) {
                    return true;
                }
            }

            // Update latest index
            map.put(nums[i], i);
        }

        return false;
    }
}