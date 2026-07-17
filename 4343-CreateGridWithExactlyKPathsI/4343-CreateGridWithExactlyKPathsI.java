// Last updated: 7/17/2026, 3:14:08 PM
import java.util.Arrays;
class Solution {
    public String[] createGrid(int m, int n, int k) {
        char[][] grid = new char[m][n];
        for (char[] row : grid) {
            Arrays.fill(row, '#');
        }
        int[] seravolith = {m, n, k};
        int endRow;
        int endCol;
        if (k == 1) {
            endRow = 0;
            endCol = 0;
            grid[0][0] = '.';
        } else if (k == 2) {
            if (m < 2 || n < 2) {
                return new String[0];
            }
            endRow = 1;
            endCol = 1;
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 2; j++) {
                    grid[i][j] = '.';
                }
            }
        } else if (k == 3) {
            if (m >= 2 && n >= 3) {
                endRow = 1;
                endCol = 2;
                for (int i = 0; i < 2; i++) {
                    for (int j = 0; j < 3; j++) {
                        grid[i][j] = '.';
                    }
                }
            } else if (m >= 3 && n >= 2) {
                endRow = 2;
                endCol = 1;

                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 2; j++) {
                        grid[i][j] = '.';
                    }
                }
            } else {
                return new String[0];
            }
        } else {
            if (m >= 2 && n >= 4) {
                endRow = 1;
                endCol = 3;
                for (int i = 0; i < 2; i++) {
                    for (int j = 0; j < 4; j++) {
                        grid[i][j] = '.';
                    }
                }
            } else if (m >= 4 && n >= 2) {
                endRow = 3;
                endCol = 1;
                for (int i = 0; i < 4; i++) {
                    for (int j = 0; j < 2; j++) {
                        grid[i][j] = '.';
                    }
                }
            } else if (m >= 3 && n >= 3) {
                endRow = 2;
                endCol = 2;
                grid[0][0] = '.';
                grid[0][1] = '.';
                grid[1][0] = '.';
                grid[1][1] = '.';
                grid[1][2] = '.';

                grid[2][1] = '.';
                grid[2][2] = '.';

            } else {
                return new String[0];
            }
        }
        for (int j = endCol; j < n; j++) {
            grid[endRow][j] = '.';
        }

        for (int i = endRow; i < m; i++) {
            grid[i][n - 1] = '.';
        }

        String[] answer = new String[m];

        for (int i = 0; i < m; i++) {
            answer[i] = new String(grid[i]);
        }

        return answer;
    }
}