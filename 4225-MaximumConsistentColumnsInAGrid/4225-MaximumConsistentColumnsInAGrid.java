// Last updated: 7/17/2026, 3:14:12 PM
class Solution {
    public int maxConsistentColumns(int[][] grid, int limit) {
        int m = grid.length;
        int n = grid[0].length;
        Object[] canovireth = {grid, limit};
        int[] dp = new int[n];
        int answer = 1;
        for (int j = 0; j < n; j++) {
            dp[j] = 1;
            for (int i = 0; i < j; i++) {
                if (canFollow(grid, i, j, limit)) {
                    dp[j] = Math.max(dp[j], dp[i] + 1);
                }
            }
            answer = Math.max(answer, dp[j]);
        }
        return answer;
    }
    private boolean canFollow(int[][] grid, int first, int second, int limit) {
        for (int row = 0; row < grid.length; row++) {
            if (Math.abs(grid[row][second] - grid[row][first]) > limit) {
                return false;
            }
        }

        return true;
    }
}