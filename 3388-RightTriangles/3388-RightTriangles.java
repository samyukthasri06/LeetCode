// Last updated: 7/17/2026, 3:14:15 PM
class Solution {
    public long numberOfRightTriangles(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        long sum = 0;
        int row[]=new int[n];
        int col[]=new int[m];
        for(int i=0;i<m;i++)
            {
                int count=0;
                for(int j=0;j<n;j++)
                    {
                        if(grid[i][j]==1)count++;
                    }
                col[i]=count;
            }
        for(int j=0;j<n;j++)
            {
                int count=0;
                for(int i=0;i<m;i++)
                    {
                        if(grid[i][j]==1)count++;
                    }
                row[j]=count;
            }
        
        for(int i=0;i<n;i++)
            {
                for(int j=0;j<m;j++)
                    {
                        if(grid[j][i]==1)
                        sum+=(long)(row[i]-1)*(col[j]-1);
                    }
            }
        return sum;
    }
}