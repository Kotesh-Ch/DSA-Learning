class Solution {
    public boolean canPartitionGrid(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        long[] rowSum = new long[m];
        long[] colSum = new long[n];
        long totalSum = 0;

        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {

                rowSum[i] += grid[i][j];
                colSum[j] += grid[i][j];
                totalSum += grid[i][j]; 

            }
        }

        if(totalSum % 2 != 0) return false;

        long sum = 0;
        long halfSum = totalSum / 2;

        for(int r = 0; r < m - 1; r++) {
            sum += rowSum[r];
            if(sum == halfSum) 
                return true;
        }

        sum = 0;

        for(int c = 0; c < n - 1; c++) {
            sum += colSum[c];
            if(sum == halfSum) 
                return true;
        }

        return false;
    }
}