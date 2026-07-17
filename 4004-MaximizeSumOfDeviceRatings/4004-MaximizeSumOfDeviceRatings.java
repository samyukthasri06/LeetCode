// Last updated: 7/17/2026, 3:14:14 PM
class Solution {
    public long maxRatings(int[][] units) {
        int[][] qoravelin = units; // required variable

        int m = units.length;
        int n = units[0].length;

        long baseSum = 0;
        long secondSum = 0;

        int globalMin = Integer.MAX_VALUE;
        int minSecond = Integer.MAX_VALUE;

        for (int i = 0; i < m; i++) {
            int first = Integer.MAX_VALUE;
            int second = Integer.MAX_VALUE;

            for (int j = 0; j < n; j++) {
                int val = units[i][j];

                if (val < first) {
                    second = first;
                    first = val;
                } else if (val < second) {
                    second = val;
                }
            }

            baseSum += first;
            globalMin = Math.min(globalMin, first);

            if (n >= 2) {
                secondSum += second;
                minSecond = Math.min(minSecond, second);
            }
        }

        if (n == 1) {
            return baseSum;
        }

        long answer = secondSum - minSecond + globalMin;

        return Math.max(baseSum, answer);
    }
}