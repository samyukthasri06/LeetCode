// Last updated: 7/17/2026, 3:14:07 PM
class Solution {
    public int minimumCost(int[] nums, int k) {
        long MOD = 1_000_000_007L;
        long sum =0;

        for(int num: nums){
            sum +=num;
        }
            long operations = (sum -1)/k;
                long answer =  (operations % MOD) * ((operations + 1)% MOD) % MOD;
            answer = answer * 500000004L % MOD;
            return (int) answer;
        
        
    }
}